package com.chamodshehanka.hp1fx.ui.controller;

import com.chamodshehanka.hp1fx.controller.StudentController;
import com.chamodshehanka.hp1fx.controller.impl.StudentControllerImpl;
import com.chamodshehanka.hp1fx.dto.GuardianDTO;
import com.chamodshehanka.hp1fx.dto.StudentDTO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 10/22/2017
 * @project HP1FX
 **/

public class StudentGuardianFormController implements Initializable{

    @FXML
    private JFXTextField txtStudentId;

    @FXML
    private JFXTextField txtStudentName;

    @FXML
    private JFXTextField txtStudentAddress;

    @FXML
    private JFXTextField txtStudentContact;

    @FXML
    private JFXComboBox cbxGender;

    @FXML
    private JFXTextField txtGuardianName;

    @FXML
    private JFXTextField txtGuardianContact;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnDelete;

    private StudentController studentController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentController=new StudentControllerImpl();
        comboBoxSelectedItem();
    }

    @FXML
    private void addStudentAction(ActionEvent actionEvent){
        String studentName=txtStudentName.getText();
        String studentAddress=txtStudentAddress.getText();
        String studentContact=txtStudentContact.getText();
        String studentGender= String.valueOf(cbxGender.getSelectionModel().getSelectedItem());

        String guardianName=txtGuardianName.getText();
        String guardianContact=txtGuardianContact.getText();

        GuardianDTO guardianDTO = new GuardianDTO(guardianName,guardianContact);
        StudentDTO studentDTO = new StudentDTO(studentName,studentAddress,studentContact,studentGender,guardianDTO);

        try {
            boolean isAdded = studentController.addStudent(studentDTO);

            if (isAdded){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Student Add");
                alert.setHeaderText("This is an infomation dialog");
                alert.setContentText("Student has being added sucessfully!!");
                alert.showAndWait();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Student Add");
                alert.setHeaderText("This is an error dialog");
                alert.setContentText("OOPs there is an error adding student");
                alert.showAndWait();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void searchStudentAction(ActionEvent actionEvent){
        String studentId=txtStudentId.getText();

        try {
            StudentDTO studentDTO = studentController.search(Integer.parseInt(studentId));

            if (studentDTO !=null){
                txtStudentId.setText(String.valueOf(studentDTO.getSid()));
                txtStudentName.setText(studentDTO.getStudentName());
                txtStudentAddress.setText(studentDTO.getAddress());
                txtStudentContact.setText(studentDTO.getContact());
//                cbxGender.setSelectionModel();
                txtGuardianName.setText(studentDTO.getGuardianDTO().getGname());
                txtStudentContact.setText(studentDTO.getGuardianDTO().getGcontact());
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Student Search");
                alert.setHeaderText("This is an error dialog");
                alert.setContentText("Student Not found");
                alert.showAndWait();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void updateStudentAction(ActionEvent actionEvent){
        GuardianDTO guardianDTO =new GuardianDTO(
                txtGuardianName.getText(),
                txtGuardianContact.getText()
        );

        /*StudentDTO studentDTO =new StudentDTO(
                txtStudentName.getText(),
                txtStudentAddress.getText(),
                txtStudentContact.getText(),
                cbxGender.getSelectionModel().getSelectedItem(),
                guardianDTO
        );*/
    }

    @FXML
    private void deleteStudentAction(ActionEvent actionEvent){
        try {
            boolean isDeleted =studentController.delete(Integer.parseInt(txtStudentId.getText()));

            if (isDeleted){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Student Delete");
                alert.setHeaderText("This is an infomation dialog");
                alert.setContentText("Student has being deleted sucessfully!!");
                alert.showAndWait();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Student Delete");
                alert.setHeaderText("This is an error dialog");
                alert.setContentText("Couldn't delete student");
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void comboBoxSelectedItem() {
        cbxGender.getItems().addAll("Male","Female");
    }
}

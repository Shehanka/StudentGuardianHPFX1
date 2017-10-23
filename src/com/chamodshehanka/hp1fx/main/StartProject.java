package com.chamodshehanka.hp1fx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author chamodshehanka on 10/22/2017
 * @project HP1FX
 **/
public class StartProject extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/chamodshehanka/hp1fx/ui/fxml/StudentGuardianForm.fxml"));
        primaryStage.setTitle("Student Guardian");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

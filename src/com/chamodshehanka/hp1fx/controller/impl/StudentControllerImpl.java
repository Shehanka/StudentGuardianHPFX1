package com.chamodshehanka.hp1fx.controller.impl;

import com.chamodshehanka.hp1fx.controller.StudentController;
import com.chamodshehanka.hp1fx.dto.StudentDTO;
import com.chamodshehanka.hp1fx.entity.Guardian;
import com.chamodshehanka.hp1fx.entity.Student;
import com.chamodshehanka.hp1fx.service.StudentService;
import com.chamodshehanka.hp1fx.service.impl.StudentServiceImpl;

import java.util.List;

/**
 * @author chamodshehanka on 10/16/2017
 * @project HP1FX
 **/

public class StudentControllerImpl implements StudentController{

    private StudentService studentService=new StudentServiceImpl();

    @Override
    public boolean addStudent(StudentDTO studentDTO) throws Exception {
        return studentService.
                addStudent(
                        new Student(studentDTO.getStudentName(),studentDTO.getAddress(),studentDTO.getContact(),studentDTO.getGender(),
                                new Guardian(studentDTO.getGuardianDTO().getGname(),studentDTO.getGuardianDTO().getGcontact()))
                );
    }

    @Override
    public StudentDTO search(int sid) throws Exception {
        return null;
    }

    @Override
    public boolean update(StudentDTO studentDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(int sid) throws Exception {
        return false;
    }

    @Override
    public List<Student> viewStudent() throws Exception {
        return studentService.viewStudentDetails();
    }
}

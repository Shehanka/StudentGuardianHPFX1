package com.chamodshehanka.hp1fx.controller;

import com.chamodshehanka.hp1fx.dto.StudentDTO;
import com.chamodshehanka.hp1fx.entity.Student;

import java.util.List;

/**
 * @author chamodshehanka on 10/21/2017
 * @project HP1FX
 **/
public interface StudentController {

    public boolean addStudent(StudentDTO studentDTO)throws Exception;

    public StudentDTO search(int sid)throws Exception;

    public boolean update(StudentDTO studentDTO)throws Exception;

    public boolean delete(int sid)throws Exception;

    public List<Student> viewStudent()throws Exception;
}

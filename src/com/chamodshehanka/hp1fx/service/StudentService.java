package com.chamodshehanka.hp1fx.service;

import com.chamodshehanka.hp1fx.entity.Student;

import java.util.List;

/**
 * @author chamodshehanka on 10/21/2017
 * @project HP1FX
 **/
public interface StudentService {

    public boolean addStudent(Student student)throws Exception;

    public Student search(int sid)throws Exception;

    public boolean update(Student student)throws Exception;

    public boolean delete(int sid)throws Exception;

    public List<Student> viewStudentDetails()throws Exception;
}

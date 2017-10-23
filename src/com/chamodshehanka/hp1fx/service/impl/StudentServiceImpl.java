package com.chamodshehanka.hp1fx.service.impl;

import com.chamodshehanka.hp1fx.dao.StudentDAO;
import com.chamodshehanka.hp1fx.dao.impl.StudentDAOImpl;
import com.chamodshehanka.hp1fx.entity.Student;
import com.chamodshehanka.hp1fx.service.StudentService;

import java.util.List;

/**
 * @author chamodshehanka on 10/21/2017
 * @project HP1FX
 **/

public class StudentServiceImpl implements StudentService{

    StudentDAO studentDAO=new StudentDAOImpl();

    @Override
    public boolean addStudent(Student student) throws Exception {
        return studentDAO.addStudent(student);
    }

    @Override
    public Student search(int sid) throws Exception {
        return studentDAO.search(sid);
    }

    @Override
    public boolean update(Student student) throws Exception {
        return studentDAO.update(student);
    }

    @Override
    public boolean delete(int sid) throws Exception {
        return studentDAO.delete(sid);
    }

    @Override
    public List<Student> viewStudentDetails() throws Exception {
        return null;
    }
}

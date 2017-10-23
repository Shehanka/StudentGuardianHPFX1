package com.chamodshehanka.hp1fx.dao;

import com.chamodshehanka.hp1fx.entity.Student;

/**
 * @author chamodshehanka on 10/16/2017
 * @project HP1FX
 **/
public interface StudentDAO {

    public boolean addStudent(Student student)throws Exception;

    public Student search(int sid)throws Exception;

    public boolean update(Student student)throws Exception;

    public boolean delete(int sid)throws Exception;

}

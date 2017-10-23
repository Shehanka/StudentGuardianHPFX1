package com.chamodshehanka.hp1fx.dao;

import com.chamodshehanka.hp1fx.entity.Guardian;
import com.chamodshehanka.hp1fx.entity.Student;

/**
 * @author chamodshehanka on 10/20/2017
 * @project HP1FX
 **/
public interface GuardianDAO {

    public boolean addGuardian(Guardian guardian)throws Exception;

    public Student search(int gid)throws Exception;

    public boolean update(Student student)throws Exception;

    public boolean delete(int gid)throws Exception;

}

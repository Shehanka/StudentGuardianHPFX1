package com.chamodshehanka.hp1fx.dao.impl;

import com.chamodshehanka.hp1fx.dao.StudentDAO;
import com.chamodshehanka.hp1fx.entity.Student;
import com.chamodshehanka.hp1fx.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * @author chamodshehanka on 10/16/2017
 * @project HP1FX
 **/

public class StudentDAOImpl implements StudentDAO {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public boolean addStudent(Student student) throws Exception {
        Session session=sessionFactory.openSession();
        Transaction transaction=null;

        try {
            transaction=session.beginTransaction();
            session.save(student);
            transaction.commit();
            return true;
        }catch (HibernateException ex){
            if (transaction !=null)transaction.rollback();
            ex.printStackTrace();
            return false;
        }finally {
            session.close();
        }
    }

    @Override
    public Student search(int sid) throws Exception {
        Session session=sessionFactory.openSession();
        Transaction transaction=null;
        Student student=null;

        try {
            transaction=session.beginTransaction();
            List<Student> list=session.createCriteria(Student.class).add(Restrictions.eq("sid",sid)).list();
            for (Student student1: list) {
                student=student1;
            }
            transaction.commit();
            return student;
        }catch (HibernateException e){
            if (transaction !=null)transaction.rollback();
            e.printStackTrace();
            return student;
        }finally {
            session.close();
        }
    }

    @Override
    public boolean update(Student student) throws Exception {
        Session session=sessionFactory.openSession();
        Transaction transaction=null;
        Student s=null;

        try {
            transaction=session.beginTransaction();
            List<Student> list=session.createCriteria(Student.class).add(Restrictions.eq("sid",student.getSid())).list();
            for (Student student1:
                 list) {
                student=student1;
            }
            s.setStudentName(student.getStudentName());
            s.setAddress(student.getAddress());
            s.setContact(student.getContact());
            s.setGender(student.getGender());
            s.setGid(student.getGid());
            session.update(s);
            transaction.commit();

            return true;
        }catch (HibernateException e){
            if (transaction !=null)transaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }
    }

    @Override
    public boolean delete(int sid) throws Exception {
        Session session=sessionFactory.openSession();
        Transaction transaction=null;
        Student s=null;

        try {
            transaction=session.beginTransaction();
            List<Student> list=session.createCriteria(Student.class).add(Restrictions.eq("sid",sid)).list();
            for (Student student1 : list){

            }
            return true;
        }catch (HibernateException e){
            return false;
        }finally {
            session.close();
        }
    }
}

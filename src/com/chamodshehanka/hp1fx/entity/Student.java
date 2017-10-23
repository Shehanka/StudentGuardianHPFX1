package com.chamodshehanka.hp1fx.entity;

import javax.persistence.*;

/**
 * @author chamodshehanka on 10/16/2017
 * @project HP1FX
 **/

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String studentName;
    private String address;
    private String contact;
    private String gender;
    @OneToOne(cascade = CascadeType.ALL)
    private int gid;

    public Student() {

    }

    public Student(int sid, String studentName, String address, String contact, String gender,int gid) {
        this.sid = sid;
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.gid=gid;
    }

    public Student(String studentName, String address, String contact, String gender,int gid) {
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.gid=gid;
    }

    public Student(String studentName, String address, String contact, String gender, Guardian guardian) {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
}

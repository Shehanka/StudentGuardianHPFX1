package com.chamodshehanka.hp1fx.dto;

/**
 * @author chamodshehanka on 10/16/2017
 * @project HP1FX
 **/

public class StudentDTO {

    private int sid;
    private String studentName;
    private String address;
    private String contact;
    private String gender;
    private GuardianDTO guardianDTO;

    public StudentDTO() {
    }

    public StudentDTO(int sid, String studentName, String address, String contact, String gender, GuardianDTO guardianDTO) {
        this.sid = sid;
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.guardianDTO = guardianDTO;
    }

    public StudentDTO(String studentName, String address, String contact, String gender, GuardianDTO guardianDTO) {
        this.studentName = studentName;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.guardianDTO = guardianDTO;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "sid=" + sid +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", gender='" + gender + '\'' +
                ", guardianDTO=" + guardianDTO +
                '}';
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

    public GuardianDTO getGuardianDTO() {
        return guardianDTO;
    }

    public void setGuardianDTO(GuardianDTO guardianDTO) {
        this.guardianDTO = guardianDTO;
    }
}

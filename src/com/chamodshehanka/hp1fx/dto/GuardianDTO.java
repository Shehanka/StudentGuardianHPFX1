package com.chamodshehanka.hp1fx.dto;

/**
 * @author chamodshehanka on 10/20/2017
 * @project HP1FX
 **/
public class GuardianDTO {

    private int gid;
    private String gname;
    private String gcontact;

    public GuardianDTO() {
    }

    public GuardianDTO(int gid, String gname, String gcontact) {
        this.gid = gid;
        this.gname = gname;
        this.gcontact = gcontact;
    }

    public GuardianDTO(String gname, String gcontact) {
        this.gname = gname;
        this.gcontact = gcontact;
    }

    @Override
    public String toString() {
        return "GuardianDTO{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gcontact='" + gcontact + '\'' +
                '}';
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGcontact() {
        return gcontact;
    }

    public void setGcontact(String gcontact) {
        this.gcontact = gcontact;
    }
}

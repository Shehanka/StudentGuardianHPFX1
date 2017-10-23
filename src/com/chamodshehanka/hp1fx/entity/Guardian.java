package com.chamodshehanka.hp1fx.entity;

import javax.persistence.*;

/**
 * @author chamodshehanka on 10/20/2017
 * @project HP1FX
 **/

@Entity
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int gid;
    private String gname;
    private String gcontact;

    public Guardian() {

    }

    public Guardian(int gid,String gname,String gcontact){
        this.gid=gid;
        this.gname=gname;
        this.gcontact=gcontact;
    }

    public Guardian(String gname, String gcontact) {
        this.gname = gname;
        this.gcontact = gcontact;
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

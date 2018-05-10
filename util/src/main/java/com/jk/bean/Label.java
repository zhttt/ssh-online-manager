package com.jk.bean;

import javax.persistence.*;

@Entity
@Table(name = "label")
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer lid;
    @Column
    private String lname;
    @Column
    private String laddress;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLaddress() {
        return laddress;
    }

    public void setLaddress(String laddress) {
        this.laddress = laddress;
    }

    @Override
    public String toString() {
        return "Label{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", laddress='" + laddress + '\'' +
                '}';
    }
}

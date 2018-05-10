package com.jk.bean;

import javax.persistence.*;

/**
 * Created by GKB on 2018/5/9.
 */
@Entity
@Table(name = "t_shopdalei")
public class TShopxiaolei {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "daid")
    private Integer daid;
    private String daname;
    @Column(name = "notes")
    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public String getDaname() {
        return daname;
    }

    public void setDaname(String daname) {
        this.daname = daname;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public TShopxiaolei() {
    }

    public TShopxiaolei(String name, Integer daid, String daname, String notes) {
        this.name = name;
        this.daid = daid;
        this.daname = daname;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "TShopxiaolei{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", daid=" + daid +
                ", daname='" + daname + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}

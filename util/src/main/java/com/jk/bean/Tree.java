package com.jk.bean;

import javax.persistence.*;

@Entity
@Table(name = "power")
public class Tree {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "text")
    private String  text;
    @Column(name = "url")
    private String  url;
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "icon")
    private String icon;
    private String children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getNodes() {
        return children;
    }

    public void setNodes(String children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                ", icon='" + icon + '\'' +
                ", children='" + children + '\'' +
                '}';
    }
}

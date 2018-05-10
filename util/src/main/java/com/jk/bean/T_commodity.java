package com.jk.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: 杨强
 * @Date: 2018/5/9 16:29
 * @Description:
 */
@Entity
@Table(name = "t_commodity")
public class T_commodity {
    @Id
    @Column(name = "commid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer commid;//id
    @Column(name = "commcount")
    private String commcount;//商品库存
    @Column(name = "comment")
    private String comment;//商品备注
    @Column(name = "commgreat")
    private Integer commgreat;//商品大类
    @Column(name = "commhotid")
    private Integer commhotid;//是否热门
    @Column(name = "commlittle")
    private Integer commlittle;//商品小类
    @Column(name = "commname")
    private String commname;//商品名称
    @Column(name = "commphoto")
    private String commphoto;//商品图片
    @Column(name = "commprice")
    private Double commprice;//商品价格
    @Column(name = "commspecialid")
    private Integer commspecialid;//是否特价
    @Column(name = "greatname")
    private String greatname;//商品大类名称
    @Column(name = "littlename")
    private String littlename;//商品小类名称
    @Column(name = "losttime")
    private String losttime;//过期时间
    @Column(name = "lotid")
    private Integer lotid;//批次id
    @Column(name = "lotname")
    private String lotname;//批次名称
    //分页
    @Column(name = "page")
    private Integer page;
    @Column(name = "rows")
    private Integer rows;

    @Column(name = "data")
    private Date data;//创建时间
    @Column(name = "updatedata")
    private Date updatedata;//修改时间

    public Integer getCommid() {
        return commid;
    }

    public void setCommid(Integer commid) {
        this.commid = commid;
    }

    public String getCommcount() {
        return commcount;
    }

    public void setCommcount(String commcount) {
        this.commcount = commcount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getCommgreat() {
        return commgreat;
    }

    public void setCommgreat(Integer commgreat) {
        this.commgreat = commgreat;
    }

    public Integer getCommhotid() {
        return commhotid;
    }

    public void setCommhotid(Integer commhotid) {
        this.commhotid = commhotid;
    }

    public Integer getCommlittle() {
        return commlittle;
    }

    public void setCommlittle(Integer commlittle) {
        this.commlittle = commlittle;
    }

    public String getCommname() {
        return commname;
    }

    public void setCommname(String commname) {
        this.commname = commname;
    }

    public String getCommphoto() {
        return commphoto;
    }

    public void setCommphoto(String commphoto) {
        this.commphoto = commphoto;
    }

    public Double getCommprice() {
        return commprice;
    }

    public void setCommprice(Double commprice) {
        this.commprice = commprice;
    }

    public Integer getCommspecialid() {
        return commspecialid;
    }

    public void setCommspecialid(Integer commspecialid) {
        this.commspecialid = commspecialid;
    }

    public String getGreatname() {
        return greatname;
    }

    public void setGreatname(String greatname) {
        this.greatname = greatname;
    }

    public String getLittlename() {
        return littlename;
    }

    public void setLittlename(String littlename) {
        this.littlename = littlename;
    }

    public String getLosttime() {
        return losttime;
    }

    public void setLosttime(String losttime) {
        this.losttime = losttime;
    }

    public Integer getLotid() {
        return lotid;
    }

    public void setLotid(Integer lotid) {
        this.lotid = lotid;
    }

    public String getLotname() {
        return lotname;
    }

    public void setLotname(String lotname) {
        this.lotname = lotname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(Date updatedata) {
        this.updatedata = updatedata;
    }

    @Override
    public String toString() {
        return "T_commodity{" +
                "commid=" + commid +
                ", commcount='" + commcount + '\'' +
                ", comment='" + comment + '\'' +
                ", commgreat=" + commgreat +
                ", commhotid=" + commhotid +
                ", commlittle=" + commlittle +
                ", commname='" + commname + '\'' +
                ", commphoto='" + commphoto + '\'' +
                ", commprice=" + commprice +
                ", commspecialid=" + commspecialid +
                ", greatname='" + greatname + '\'' +
                ", littlename='" + littlename + '\'' +
                ", losttime='" + losttime + '\'' +
                ", lotid=" + lotid +
                ", lotname='" + lotname + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", data=" + data +
                ", updatedata=" + updatedata +
                '}';
    }
}

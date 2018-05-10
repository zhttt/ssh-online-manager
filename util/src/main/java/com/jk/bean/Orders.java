package com.jk.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable{
    @Id
    @Column(name = "ordersid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer ordersid;//id
    @Column(name = "orderscode")
    private Integer orderscode;//订单编号
    @Column(name = "orderscreattime")
    private Date orderscreattime;//创建时间
    @Column(name = "ordersmoney")
    private Double ordersmoney;//总价格
    @Column(name = "ordersproduct")
    private String ordersproduct;//订单的产品
    @Column(name = "orderspronum")
    private Integer orderspronum;//订单中的产品的数量
    @Column(name = "ordersstatus")
    private Integer ordersstatus;//状态
    @Column(name = "ordersuser")
    private Integer ordersuser;//订单人id
    //分页
    @Column(name = "page")
    private Integer page;
    @Column(name = "rows")
    private Integer rows;

    @Column(name = "userid")
    private Integer userid;
    @Column(name = "ordersupdatadata")
    private Date ordersupdatadata;//修改时间

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }

    public Integer getOrderscode() {
        return orderscode;
    }

    public void setOrderscode(Integer orderscode) {
        this.orderscode = orderscode;
    }

    public Date getOrderscreattime() {
        return orderscreattime;
    }

    public void setOrderscreattime(Date orderscreattime) {
        this.orderscreattime = orderscreattime;
    }

    public Double getOrdersmoney() {
        return ordersmoney;
    }

    public void setOrdersmoney(Double ordersmoney) {
        this.ordersmoney = ordersmoney;
    }

    public String getOrdersproduct() {
        return ordersproduct;
    }

    public void setOrdersproduct(String ordersproduct) {
        this.ordersproduct = ordersproduct;
    }

    public Integer getOrderspronum() {
        return orderspronum;
    }

    public void setOrderspronum(Integer orderspronum) {
        this.orderspronum = orderspronum;
    }

    public Integer getOrdersstatus() {
        return ordersstatus;
    }

    public void setOrdersstatus(Integer ordersstatus) {
        this.ordersstatus = ordersstatus;
    }

    public Integer getOrdersuser() {
        return ordersuser;
    }

    public void setOrdersuser(Integer ordersuser) {
        this.ordersuser = ordersuser;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOrdersupdatadata() {
        return ordersupdatadata;
    }

    public void setOrdersupdatadata(Date ordersupdatadata) {
        this.ordersupdatadata = ordersupdatadata;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersid=" + ordersid +
                ", orderscode=" + orderscode +
                ", orderscreattime=" + orderscreattime +
                ", ordersmoney=" + ordersmoney +
                ", ordersproduct='" + ordersproduct + '\'' +
                ", orderspronum=" + orderspronum +
                ", ordersstatus=" + ordersstatus +
                ", ordersuser=" + ordersuser +
                ", page=" + page +
                ", rows=" + rows +
                ", userid=" + userid +
                ", ordersupdatadata=" + ordersupdatadata +
                '}';
    }
}

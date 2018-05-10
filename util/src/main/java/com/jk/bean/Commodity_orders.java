package com.jk.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: 杨强
 * @Date: 2018/5/9 16:08
 * @Description:
 */
@Entity
@Table(name = "commodity_orders")
public class Commodity_orders {
    @Id
    @Column(name = "coid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer coid;//id
    @Column(name = "oid")
    private String oid;//商品id//商品","分割
    @Column(name = "onum")
    private String onum;//订购的商品数量
    @Column(name = "data")
    private Date data;//创建时间
    @Column(name = "updatedata")
    private Date updatedata;//修改时间

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOnum() {
        return onum;
    }

    public void setOnum(String onum) {
        this.onum = onum;
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
        return "Commodity_orders{" +
                "coid=" + coid +
                ", oid='" + oid + '\'' +
                ", onum='" + onum + '\'' +
                ", data=" + data +
                ", updatedata=" + updatedata +
                '}';
    }
}

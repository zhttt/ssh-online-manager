package com.jk.bean;

import org.hibernate.mapping.IdGenerator;

import javax.persistence.*;

/**
 * Created by GKB on 2018/5/9.
 */
@Entity
@Table(name = "t_shop")
public class TShop {

    @Id
    @Column(name = "id",unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "image")
    private String image;
    @Column(name = "sname")
    private String sname;
    @Column(name = "price", precision = 10)
    private Double price;
    @Column(name = "kucun")
    private Integer kucun;
    @Column(name = "xiaoid")
    private Integer xiaoid;
    @Column(name = "daid")
    private Integer daid;
    @Column(name = "rid")
    private Integer rid;
    @Column(name = "tid")
    private Integer tid;
    @Transient
    private String xiaoname;//==============
    @Transient
    private String daname;//=============
    @Column(name="pasttime")
    private String pasttime;
    @Column(name="pcid")
    private Integer pcid;
    @Transient
    private String pcname;//==============
    @Column(name="zhekou")
    private Double zhekou=1.0;
    @Column(name="zhehouprice")
    private String zhehouprice;
    @Transient
    private Integer count=1;//-============
    @Transient
    private Double xiaoji;//================
    @Transient
    private String begintime;//=========
    @Transient
    private String endtime;//=========
    @Transient
    private Integer mcount;//===========
    @Transient
    private Double mprice;//===========
    @Transient
    private String namess;//===========


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getKucun() {
        return kucun;
    }

    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    public Integer getXiaoid() {
        return xiaoid;
    }

    public void setXiaoid(Integer xiaoid) {
        this.xiaoid = xiaoid;
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getXiaoname() {
        return xiaoname;
    }

    public void setXiaoname(String xiaoname) {
        this.xiaoname = xiaoname;
    }

    public String getDaname() {
        return daname;
    }

    public void setDaname(String daname) {
        this.daname = daname;
    }

    public String getPasttime() {
        return pasttime;
    }

    public void setPasttime(String pasttime) {
        this.pasttime = pasttime;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public Double getZhekou() {
        return zhekou;
    }

    public void setZhekou(Double zhekou) {
        this.zhekou = zhekou;
    }

    public String getZhehouprice() {
        return zhehouprice;
    }

    public void setZhehouprice(String zhehouprice) {
        this.zhehouprice = zhehouprice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getXiaoji() {
        return xiaoji;
    }

    public void setXiaoji(Double xiaoji) {
        this.xiaoji = xiaoji;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getMcount() {
        return mcount;
    }

    public void setMcount(Integer mcount) {
        this.mcount = mcount;
    }

    public Double getMprice() {
        return mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }

    public String getNamess() {
        return namess;
    }

    public void setNamess(String namess) {
        this.namess = namess;
    }

    @Override
    public String toString() {
        return "SThop{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", sname='" + sname + '\'' +
                ", price=" + price +
                ", kucun=" + kucun +
                ", xiaoid=" + xiaoid +
                ", daid=" + daid +
                ", rid=" + rid +
                ", tid=" + tid +
                ", xiaoname='" + xiaoname + '\'' +
                ", daname='" + daname + '\'' +
                ", pasttime='" + pasttime + '\'' +
                ", pcid=" + pcid +
                ", pcname='" + pcname + '\'' +
                ", zhekou=" + zhekou +
                ", zhehouprice='" + zhehouprice + '\'' +
                ", count=" + count +
                ", xiaoji=" + xiaoji +
                ", begintime='" + begintime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", mcount=" + mcount +
                ", mprice=" + mprice +
                ", namess='" + namess + '\'' +
                '}';
    }
}

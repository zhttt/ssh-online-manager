package com.jk.action.gkk;


import com.jk.bean.TShopdalei;
import com.jk.bean.TShopxiaolei;
import com.jk.service.ShopService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by GKB on 2018/5/9.
 */
@Action("shopaction")
@Results({
        @Result(name="yemian",location = "/shop/addshopdalei.jsp"),
        @Result(name="yemian1",location = "/shop/updateshopdalei.jsp"),
        @Result(name="toshopdalei",location="/shop/shopdalei.jsp"),
        @Result(name="toshopxiaolei",location="/shop/shopxiaolei.jsp")
})
public class ShopAction extends  BaseAction {

    @Autowired
    private ShopService shopservice;

    private TShopdalei shopdalei;
    private String name;
    private Integer id;
    private TShopxiaolei shopxiaolei;

    public TShopxiaolei getShopxiaolei() {
        return shopxiaolei;
    }

    public void setShopxiaolei(TShopxiaolei shopxiaolei) {
        this.shopxiaolei = shopxiaolei;
    }

    public TShopdalei getShopdalei() {
        return shopdalei;
    }

    public void setShopdalei(TShopdalei shopdalei) {
        this.shopdalei = shopdalei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //查询商品大类
    @Action("queryshopdalei")
    public void queryshopdalei() {

        List<TShopdalei> list = shopservice.queryshopdalei();

        System.out.println(list);

        super.writeJson(list);
    }

    //新增或者跳转修改大类页面
    @Action("toaddshopdalei")
    public  String toaddshopdalei(){

        return "yemian";
    }
    //新增或者修改
    @Action("addshopdalei")
    public void addshopdalei (){
        shopservice.addshopdalei(shopdalei);
        super.writeJson("1");
    }
    /**
     * 删除商品大类
     */
    @Action("deleteshopdaleibyids")
    public void deleteshopdaleibyid(){

        shopservice.deleteshopdaleibyid(id);
        super.writeJson("1");
    }

    /**
     * 根据id查询和修改大类
     */
    @Action("selectshopdaleibyid")
    public String selectshopdaleibyid(){

        TShopdalei shopdalei= shopservice.selectshopdaleibyid(id);

        ServletActionContext.getRequest().getSession().setAttribute("shopdalei", shopdalei);
        return "yemian1";
    }

    /**
    * 查询小类
    */





    /**
     * 两个跳转页面
     */
    @Action("toshopdalei")
    public String toshopdalei(){

        return "toshopdalei";
    }
    @Action("toshopxiaolei")
    public String toshopxiaolei(){


        return "toshopxiaolei";
    }
}


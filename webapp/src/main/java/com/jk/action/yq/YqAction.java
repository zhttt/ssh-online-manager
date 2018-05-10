package com.jk.action.yq;

import com.jk.bean.Orders;
import com.jk.service.YqService;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.Serializable;
import java.util.List;
@Namespace("/")
@Action(value = "order",results = {
        @Result(name="query",location = "/yqorder.jsp"),
        @Result(name="delete",location = "/yqorder.jsp"),
        @Result(name="add",location = "/yqorder.jsp")
})
public class YqAction extends BaseAction implements ModelDriven<Orders> {
    @Autowired
    private YqService yqservice;
    private List<Orders> list;

    public String queryOrder(){
        /**
         *
         * 功能描述: 查询orders表
         *
         * @param: []
         * @return: java.lang.String
         * @auther: 杨强
         * @date: 2018/5/9 16:23
         */
        list=yqservice.queryOrder();
        super.writeJson(list);

        return "query";
    }
    //string类型ids
    private  String ids;
    public String deleteOrder(){
        /**
         *
         * 功能描述: 删除
         *
         * @param: []
         * @return: java.lang.String
         * @auther: 杨强
         * @date: 2018/5/10 15:12
         */
        yqservice.deleteOrder(ids);
        String falg="success";
        super.writeJson(falg);
        return "delete";
    }
    private Orders orders=new Orders();
    public String addOrder(){
        System.err.print(orders.toString());
        yqservice.addorder(orders);
        String falg="success";
        super.writeJson(falg);
        return "add";
    }
    public List<Orders> getList() {
        return list;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }

    @Override
    public String getIds() {
        return ids;
    }

    @Override
    public void setIds(String ids) {
        this.ids = ids;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public Orders getModel() {
        return orders;
    }
}

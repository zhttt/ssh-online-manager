package com.jk.action;

import com.jk.bean.Orders;
import com.jk.service.YqService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Action(value = "order",results = {
        @Result(name="query",location = "/yqorder.jsp")
})

public class YqAction {
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
        return "query";
    }

    public List<Orders> getList() {
        return list;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }
}

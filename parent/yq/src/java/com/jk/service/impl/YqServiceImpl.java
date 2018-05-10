package com.jk.service.impl;

import com.jk.bean.Orders;
import com.jk.dao.YqDao;
import com.jk.service.YqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YqServiceImpl implements YqService{
    @Autowired
    private YqDao yqdao;

    public List queryOrder() {
        return yqdao.queryOrder();
    }

    public void deleteOrder(String ids) {
        yqdao.deleteOrder(ids);
    }

    public void addorder(Orders orders) {
        yqdao.addorder(orders);
    }
}

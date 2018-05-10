package com.jk.service;

import com.jk.bean.Orders;

import java.util.List;

public interface YqService {
    List queryOrder();

    void deleteOrder(String ids);


    void addorder(Orders orders);
}

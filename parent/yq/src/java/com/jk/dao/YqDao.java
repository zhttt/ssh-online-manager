package com.jk.dao;

import com.jk.bean.Orders;

import java.util.List;

public interface YqDao {
    List queryOrder();

    void deleteOrder(String ids);

    void addorder(Orders orders);
}

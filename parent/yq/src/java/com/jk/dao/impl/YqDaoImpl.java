package com.jk.dao.impl;

import com.jk.bean.Orders;
import com.jk.dao.YqDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import java.util.List;

@Repository

public class YqDaoImpl implements YqDao{
    @Autowired
    private SessionFactory sessionFactory;

    public List queryOrder() {
        return sessionFactory.getCurrentSession().createQuery("from Orders").list();
    }

    public void deleteOrder(String ids) {
        String hql="DELETE FROM Orders s WHERE s.ordersid IN ("+ids+")";
        sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
    }

    public void addorder(Orders orders) {
        sessionFactory.getCurrentSession().save(orders);
    }
}

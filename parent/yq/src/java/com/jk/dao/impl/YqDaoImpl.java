package com.jk.dao.impl;

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
}

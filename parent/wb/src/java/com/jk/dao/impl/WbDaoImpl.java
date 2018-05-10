package com.jk.dao.impl;

import com.jk.dao.WbDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class WbDaoImpl implements WbDao{

    @Autowired
    private SessionFactory sessionFactory;

    public List queryLabel() {
        List list =sessionFactory.getCurrentSession().createQuery(" from Label").list();
        return list;
    }
}

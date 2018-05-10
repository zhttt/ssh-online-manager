package com.jk.dao.impl;

import com.jk.dao.IUserDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public List queruAll() {
        return sessionFactory.openSession().createQuery("from User").list();
    }

    @Override
    public List getTree() {
        return sessionFactory.openSession().createQuery("from Tree").list();
    }

}

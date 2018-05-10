package com.jk.dao.impl;

import com.jk.bean.TShopdalei;
import com.jk.dao.ShopDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by GKB on 2018/5/9.
 */
@Repository("shopDao")
public class ShopDaoImpl implements ShopDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<TShopdalei> queryshopdalei() {

        return sessionFactory.getCurrentSession().createQuery("from TShopdalei").list();
    }

    //新增或修改大类
    public void addshopdalei(TShopdalei shopdalei) {
        this.sessionFactory.getCurrentSession().saveOrUpdate(shopdalei);

    }

    //删除商品大类
    public void deleteshopdaleibyid(String str) {
        this.sessionFactory.getCurrentSession().createQuery(str).executeUpdate();
    }

    //根据id查询和修改大类
    public TShopdalei selectshopdaleibyid(Integer id) {
        TShopdalei Object =  this.sessionFactory.getCurrentSession().get(TShopdalei.class,id);
        return Object;
    }


}

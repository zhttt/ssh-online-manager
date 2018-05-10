package com.jk.dao;

import com.jk.bean.TShopdalei;

import java.util.List;

/**
 * Created by GKB on 2018/5/9.
 */
public interface ShopDao {

    List<TShopdalei> queryshopdalei();

    void addshopdalei(TShopdalei shopdalei);


    void deleteshopdaleibyid(String str);

    TShopdalei selectshopdaleibyid(Integer id);
}

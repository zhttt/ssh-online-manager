
package com.jk.service;

import com.jk.bean.TShopdalei;

import java.util.List;

/**
 * Created by GKB on 2018/5/9.
 */
public interface ShopService {


    List<TShopdalei> queryshopdalei();

    void addshopdalei(TShopdalei shopdalei);

    void deleteshopdaleibyid(Integer id);

    TShopdalei selectshopdaleibyid(Integer id);
}

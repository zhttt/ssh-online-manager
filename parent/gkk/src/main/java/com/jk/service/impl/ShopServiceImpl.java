package com.jk.service.impl;

import com.jk.bean.TShopdalei;
import com.jk.dao.ShopDao;
import com.jk.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GKB on 2018/5/9.
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopdao;


    public List<TShopdalei> queryshopdalei() {
       // StringBuffer str = new StringBuffer("from TShopdalei");
          //  String hql = "from TShopdalei";
        return shopdao.queryshopdalei();
    }

    //新增或修改大类
    public void addshopdalei(TShopdalei shopdalei) {
        shopdao.addshopdalei(shopdalei);
    }

    //删除商品大类
    public void deleteshopdaleibyid(Integer id) {
        StringBuffer str = new StringBuffer("delete TShopdalei where id="+id);

        shopdao.deleteshopdaleibyid(str.toString());
    }

    //根据id查询和修改大类
    public TShopdalei selectshopdaleibyid(Integer id) {
        return shopdao.selectshopdaleibyid(id);
    }
}


package com.jk.service.impl;

import com.jk.dao.WbDao;
import com.jk.service.WbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WbServiceImpl  implements WbService{

    @Autowired
    private WbDao wbdao;

    public List queryLabel() {
        return wbdao.queryLabel();
    }
}

package org.xp.spring6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xp.spring6.dao.OrderDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderService
 * @description <TODO description class purpose>
 * @create 2023/7/29 11:44
 * @since 1.0
 **/
@Service
public class OrderService {

    @Autowired
    @Qualifier("oderDaoImplForOracle")
    private OrderDao orderDao;

    public void generate(){
        orderDao.insert();
    }
}

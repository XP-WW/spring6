package com.xp.spring6.service;

import com.xp.spring6.dao.OrderDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderService
 * @description <TODO description class purpose>
 * @create 2023/7/19 10:45
 * @since 1.0
 **/
public class OrderService {
    private OrderDao orderDao;

    //通过set方法给属性赋值
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     生成订单的业务方法
     */
    public void generate(){
        orderDao.insert();
    }
}

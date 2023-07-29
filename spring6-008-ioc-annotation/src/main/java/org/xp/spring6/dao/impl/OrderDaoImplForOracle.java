package org.xp.spring6.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.xp.spring6.dao.OrderDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderDaoImplForOracle
 * @description <TODO description class purpose>
 * @create 2023/7/29 11:56
 * @since 1.0
 **/
@Repository("oderDaoImplForOracle")
public class OrderDaoImplForOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle数据库正在保存订单信息......");
    }
}

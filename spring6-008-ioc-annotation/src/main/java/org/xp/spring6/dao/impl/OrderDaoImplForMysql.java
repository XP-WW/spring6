package org.xp.spring6.dao.impl;

import org.springframework.stereotype.Repository;
import org.xp.spring6.dao.OrderDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderDaoImplForMysql
 * @description <TODO description class purpose>
 * @create 2023/7/29 11:43
 * @since 1.0
 **/
@Repository("oderDaoImplForMysql")
public class OrderDaoImplForMysql implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Mysql数据库正在保存订单信息......");
    }
}

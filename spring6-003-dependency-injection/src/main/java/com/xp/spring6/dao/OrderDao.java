package com.xp.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderDao
 * @description <TODO description class purpose>
 * @create 2023/7/19 10:44
 * @since 1.0
 **/
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);
    public void insert(){
        logger.info("订单正在生成......");
    }
}

package com.xp.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author 苏禾
 * @version 1.0
 * @title UserDao
 * @description <TODO description class purpose>
 * @create 2023/7/19 9:54
 * @since 1.0
 **/
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
        //System.out.println("数据库正在保存用户信息");
        logger.info("数据库正在保存用户信息");
    }
}

package com.xp.spring6.service;

import com.xp.spring6.dao.UserDao;
import com.xp.spring6.dao.VipDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title CustomerService
 * @description <TODO description class purpose>
 * @create 2023/7/19 10:21
 * @since 1.0
 **/
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();
    }
}

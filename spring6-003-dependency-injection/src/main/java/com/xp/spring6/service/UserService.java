package com.xp.spring6.service;

import com.xp.spring6.dao.UserDao;
import com.xp.spring6.dao.VipDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title UserService
 * @description <TODO description class purpose>
 * @create 2023/7/19 9:57
 * @since 1.0
 **/
public class UserService {
    private UserDao userDao;
    private VipDao vipDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveUser() {
        userDao.insert();
        vipDao.insert();
    }
}

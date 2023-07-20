package com.xp.spring6.service.impl;

import com.xp.spring6.dao.UserDao;
import com.xp.spring6.service.UserService;

/**
 * @author 苏禾
 * @version 1.0
 * @title UserServiceImpl
 * @description <TODO description class purpose>
 * @create 2023/7/18 17:14
 * @since 1.0
 **/
public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImplForMySQL();

    private UserDao userDao;
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}

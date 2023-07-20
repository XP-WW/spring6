package com.xp.spring6.dao;

import com.xp.spring6.dao.UserDao;

/**
 * @author 苏禾
 * @version 1.0
 * @title UserDaoImplForOracle
 * @description <TODO description class purpose>
 * @create 2023/7/18 17:12
 * @since 1.0
 **/
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("Oracle数据库正在删除用户信息......");
    }
}

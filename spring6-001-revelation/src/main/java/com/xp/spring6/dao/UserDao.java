package com.xp.spring6.dao;

/**
 * @author 苏禾
 * @version 1.0
 * @title UserDao
 * @description 持久层
 * @create 2023/7/18 17:00
 * @since 1.0
 **/
public interface UserDao {

    /**
     *根据id删除用户信息
     */
    void deleteById();
}

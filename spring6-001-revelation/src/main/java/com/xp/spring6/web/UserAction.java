package com.xp.spring6.web;

import com.xp.spring6.service.UserService;
import com.xp.spring6.service.impl.UserServiceImpl;

/**
 * @author 苏禾
 * @version 1.0
 * @title UserAction
 * @description 表示层
 * @create 2023/7/18 17:11
 * @since 1.0
 **/
public class UserAction {
    private UserService userService = new UserServiceImpl();
    /**
     *删除用户信息的请求
     */
    public void deleteRequest(){
        userService.deleteUser();
    }
}

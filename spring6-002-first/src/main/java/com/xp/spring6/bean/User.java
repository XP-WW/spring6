package com.xp.spring6.bean;

import org.springframework.context.annotation.Bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title User
 * @description 这是一个bean，封装了用户信息
 * @create 2023/7/18 19:30
 * @since 1.0
 **/
public class User {

    /**
     * 默认情况下spring会通过反射机制，调用类的无参数构造方法来实例化对象。
     *Class clazz = Class.forName("com.xp.spring6.User");
     *Object obj = clazz.newInstance();
     */
    public User() {
        System.out.println("user无参数构造方法执行了......");
    }
}

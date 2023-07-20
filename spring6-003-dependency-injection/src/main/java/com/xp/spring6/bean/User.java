package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title User
 * @description <TODO description class purpose>
 * @create 2023/7/19 10:58
 * @since 1.0
 **/
public class User {
    private String username;//String是简单类型
    private String password;
    private int age;//int是简单类型

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

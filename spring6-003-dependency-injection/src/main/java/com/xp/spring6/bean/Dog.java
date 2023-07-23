package com.xp.spring6.bean;

import java.util.Date;

/**
 * @author 苏禾
 * @version 1.0
 * @title Dog
 * @description <TODO description class purpose>
 * @create 2023/7/20 16:11
 * @since 1.0
 **/
public class Dog {
    //简单类型
    private String name;
    private int age;
    //非简单类型
    private Date birth;

    //p命名空间注入，底层还是set注入，只不过p命令空间注入可以让spring配置变的更简单
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}

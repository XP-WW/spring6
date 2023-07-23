package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title People
 * @description <TODO description class purpose>
 * @create 2023/7/22 17:26
 * @since 1.0
 **/
public class People {
    private String name;
    private int age;
    private boolean sex;

    //c命名空间是简化构造方法注入的
    public People(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title Cat
 * @description <TODO description class purpose>
 * @create 2023/7/19 22:24
 * @since 1.0
 **/
public class Cat {
    public String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

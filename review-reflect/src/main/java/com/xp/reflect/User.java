package com.xp.reflect;

/**
 * @author 苏禾
 * @version 1.0
 * @title User
 * @description <TODO description class purpose>
 * @create 2023/7/29 9:18
 * @since 1.0
 **/
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

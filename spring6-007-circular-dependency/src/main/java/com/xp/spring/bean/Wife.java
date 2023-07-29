package com.xp.spring.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title Wife
 * @description <TODO description class purpose>
 * @create 2023/7/28 11:36
 * @since 1.0
 **/
public class Wife {
    private String name;
    private Husband husband;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}

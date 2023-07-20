package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title Clazz
 * @description 班级
 * @create 2023/7/19 11:23
 * @since 1.0
 **/
public class Clazz {
    private String name;

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

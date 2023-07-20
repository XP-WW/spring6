package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title Woman
 * @description <TODO description class purpose>
 * @create 2023/7/19 21:54
 * @since 1.0
 **/
public class Woman {
    private String name;

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

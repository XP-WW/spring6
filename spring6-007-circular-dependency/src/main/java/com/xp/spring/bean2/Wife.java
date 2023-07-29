package com.xp.spring.bean2;

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

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }

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

}

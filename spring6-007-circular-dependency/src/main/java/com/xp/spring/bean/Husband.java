package com.xp.spring.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title Husband
 * @description <TODO description class purpose>
 * @create 2023/7/28 11:36
 * @since 1.0
 **/
public class Husband {
    private String name;
    private Wife wife;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}

package com.xp.spring.bean2;

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

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
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
}

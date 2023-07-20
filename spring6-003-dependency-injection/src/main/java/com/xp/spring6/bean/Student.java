package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title Student
 * @description 学生
 * @create 2023/7/19 11:24
 * @since 1.0
 **/
public class Student {
    private String name;
    private Clazz clazz;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

}

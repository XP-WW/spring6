package com.xp.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 苏禾
 * @version 1.0
 * @title Test3
 * @description <TODO description class purpose>
 * @create 2023/7/29 9:20
 * @since 1.0
 **/
public class Test3 {
    public static void main(String[] args) throws Exception {
        /*
        需求：给User对象的age属性赋值
        */
        Class<?> clazz = Class.forName("com.xp.reflect.User");
        Object o = clazz.newInstance();
        Method setAge = clazz.getDeclaredMethod("setAge", int.class);
        setAge.invoke(o,15);
        System.out.println(o);

    }
}

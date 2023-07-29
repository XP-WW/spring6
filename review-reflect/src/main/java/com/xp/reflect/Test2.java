package com.xp.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 苏禾
 * @version 1.0
 * @title Test2
 * @description <TODO description class purpose>
 * @create 2023/7/28 12:32
 * @since 1.0
 **/
public class Test2 {
    public static void main(String[] args) throws Exception {
        //使用反射机制怎么调用方法
        Class<?> clazz = Class.forName("com.xp.reflect.SomService");
        Method doSome = clazz.getDeclaredMethod("doSome", String.class, int.class);
        Constructor<?> con = clazz.getDeclaredConstructor();
        Object obj = con.newInstance();
        Object result = doSome.invoke(obj, "李四", 20);
        System.out.println(result);
        Field name = clazz.getDeclaredField("name");

        name.setAccessible(true);
        Object o = name.get(obj);
        System.out.println(o);
    }

}

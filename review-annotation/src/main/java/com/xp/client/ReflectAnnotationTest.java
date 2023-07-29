package com.xp.client;

import com.xp.annotation.Component;

/**
 * @author 苏禾
 * @version 1.0
 * @title ReflectAnnotationTest
 * @description <TODO description class purpose>
 * @create 2023/7/29 10:05
 * @since 1.0
 **/
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.xp.bean.User");
        if (clazz.isAnnotationPresent(Component.class)) {
            Component annotation = clazz.getAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
}

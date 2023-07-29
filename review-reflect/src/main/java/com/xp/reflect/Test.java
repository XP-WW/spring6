package com.xp.reflect;

/**
 * @author 苏禾
 * @version 1.0
 * @title Test
 * @description <TODO description class purpose>
 * @create 2023/7/28 12:27
 * @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //不使用反射机制调用这些方法
        SomService somService = new SomService();
        somService.doSome();
        String s1 = somService.doSome("张三");
        System.out.println(s1);
        String s2 = somService.doSome("李四", 20);
        System.out.println(s2);
    }
}

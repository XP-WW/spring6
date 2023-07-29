package com.xp.reflect;

/**
 * @author 苏禾
 * @version 1.0
 * @title SomService
 * @description <TODO description class purpose>
 * @create 2023/7/28 12:25
 * @since 1.0
 **/
public class SomService {
    private String name = "zhang";
    public void doSome(){
        System.out.println("doSome()方法执行。。。。");
    }

    public String doSome(String s){
        System.out.println("doSome(String s)方法执行。。。。");
        return s;
    }

    public String doSome(String s,int i){
        System.out.println("doSome(String s,int i)方法执行。。。。");
        return s + i;
    }
}

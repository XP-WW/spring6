package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title StarFactory
 * @description 工厂类角色
 * @create 2023/7/25 12:08
 * @since 1.0
 **/
public class StarFactory {
    public static Star get(){
        return new Star();
    };
}

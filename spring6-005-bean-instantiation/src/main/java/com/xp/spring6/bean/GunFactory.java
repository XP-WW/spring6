package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title GunFactory
 * @description 具体工厂角色
 * @create 2023/7/27 21:44
 * @since 1.0
 **/
public class GunFactory {
    public Gun get(){
        return new Gun();
    }
}

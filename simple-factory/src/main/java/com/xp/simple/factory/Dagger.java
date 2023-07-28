package com.xp.simple.factory;

/**
 * @author 苏禾
 * @version 1.0
 * @title Dagger
 * @description 具体产品角色
 * @create 2023/7/25 11:23
 * @since 1.0
 **/
public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍丫的!!!");
    }
}

package com.xp.factory.method;

/**
 * @author 苏禾
 * @version 1.0
 * @title Tank
 * @description 具体产品角色
 * @create 2023/7/25 11:21
 * @since 1.0
 **/
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开炮!!!");
    }
}

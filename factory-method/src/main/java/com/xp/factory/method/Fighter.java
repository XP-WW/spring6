package com.xp.factory.method;

/**
 * @author 苏禾
 * @version 1.0
 * @title Fighter
 * @description 具体产品角色
 * @create 2023/7/25 11:21
 * @since 1.0
 **/
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机抛下小男孩!!!");
    }
}

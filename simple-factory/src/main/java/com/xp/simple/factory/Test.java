package com.xp.simple.factory;

/**
 * @author 苏禾
 * @version 1.0
 * @title Test
 * @description 客户端程序
 * @create 2023/7/25 11:29
 * @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //需要坦克
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        //需要匕首
        Weapon dagger = WeaponFactory.get("DAGGER");
        dagger.attack();
        //需要战斗机
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();
    }
}

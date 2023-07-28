package com.xp.factory.method;

/**
 * @author 苏禾
 * @version 1.0
 * @title Test
 * @description 客户端程序
 * @create 2023/7/25 11:49
 * @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new DaggerFactory();
        Weapon dagger = weaponFactory.get();
        dagger.attack();

        WeaponFactory weaponFactory1  = new FighterFactory();
        Weapon fighter = weaponFactory1.get();
        fighter.attack();
    }
}

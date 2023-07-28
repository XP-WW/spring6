package com.xp.factory.method;

/**
 * @author 苏禾
 * @version 1.0
 * @title FighterFactory
 * @description 具体工厂
 * @create 2023/7/25 11:47
 * @since 1.0
 **/
public class FighterFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Fighter();
    }
}

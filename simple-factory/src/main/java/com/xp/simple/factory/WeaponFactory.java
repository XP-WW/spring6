package com.xp.simple.factory;

/**
 * @author 苏禾
 * @version 1.0
 * @title WeaponFactory
 * @description 工厂类角色
 * @create 2023/7/25 11:24
 * @since 1.0
 **/
public class WeaponFactory {
    /**
     * 静态方法。要获取什么产品，就传什么参数
     *
     * @param weaponType
     * @return Weapon
     */
    public static Weapon get(String weaponType) {
        if ("TANK".equals(weaponType)) {
            return new Tank();
        } else if ("DAGGER".equals(weaponType)) {
            return new Dagger();
        } else if ("FIGHTER".equals(weaponType)) {
            return new Fighter();
        } else {
            throw new RuntimeException("不支持该武器的生产");
        }
    }
}

package com.xp.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 苏禾
 * @version 1.0
 * @title Person
 * @description <TODO description class purpose>
 * @create 2023/7/19 22:02
 * @since 1.0
 **/
public class Person {
    //注入List集合
    private List<String> names;
    //注入set集合
    private Set<String> address;

    private Map<Integer, String> phones;


    /*
     * 注入属性类对象，本质上也是一个Map集合
     * 父类是HashTable，实现了Map接口
     * 虽然也是一个Map集合，但是和Map的注入方式有点像但是不同
     * Properties的key和value只能是String类型
     * */
    private Properties properties;

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}

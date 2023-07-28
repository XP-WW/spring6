package com.xp.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 苏禾
 * @version 1.0
 * @title PersonFactoryBean
 * @description <TODO description class purpose>
 * @create 2023/7/27 21:53
 * @since 1.0
 **/
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

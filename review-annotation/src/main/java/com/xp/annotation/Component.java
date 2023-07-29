package com.xp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 苏禾
 * @version 1.0
 * @title Component
 * @description 自定义注解
 * @create 2023/7/29 9:49
 * @since 1.0
 **/
//@Target(value = {ElementType.TYPE})//标注注解的注解，叫做元注解，告诉该注解可以出现的位置
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    String value();
    /*String name();*/
}

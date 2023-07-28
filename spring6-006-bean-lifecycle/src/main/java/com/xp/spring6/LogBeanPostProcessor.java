package com.xp.spring6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 苏禾
 * @version 1.0
 * @title LogBeanPostProcessor
 * @description 日志Bean后处理器
 * @create 2023/7/28 10:37
 * @since 1.0
 **/
public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步：执行Bean后处理器的Before方法。");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：执行Bean后处理器的After方法。");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

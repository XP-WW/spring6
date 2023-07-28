package com.xp.spring6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author 苏禾
 * @version 1.0
 * @title User
 * @description Bean的生命周期按照粗略的五步的话；
 * 第一步：实例化Bean（调用无参数构造方法）
 * 第二步：给Bean属性赋值（调用set方法。）
 * 第三步：初始化Bean（会调用Bean的init方法。注意：这个init方法需要自己写，自己配）
 * 第四步：使用Bean
 * 第五步：销毁Bean(会调用Bean的destroy方法，这个方法需要自己写）
 * @create 2023/7/28 9:49
 * @since 1.0
 **/
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;

    public User() {
        System.out.println("第一步，无参数构造方法执行");
    }

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值。");
        this.name = name;
    }

    public void initBean(){
        System.out.println("第四步：初始化Bean");
    }

    public void destroyBean(){
        System.out.println("第七步：销毁Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean这个类的加载器："+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个Bean的工厂对象是："+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("这个Bean的名字是"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean的destroy()");
    }
}

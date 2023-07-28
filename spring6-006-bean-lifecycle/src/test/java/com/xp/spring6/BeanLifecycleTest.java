package com.xp.spring6;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 苏禾
 * @version 1.0
 * @title BeanLifecycleTest
 * @description <TODO description class purpose>
 * @create 2023/7/28 10:17
 * @since 1.0
 **/
public class BeanLifecycleTest {
    @Test
    public void testBeanLifecycleFive(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第六步：使用Bean"+user);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @Test
    public void testRegisterBean(){
        //自己new对象
        Student student = new Student();
        System.out.println(student);

        //将以上自己new的这个对象纳入Spring容器来管理
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);

        Object studentBean = factory.getBean("studentBean");
        System.out.println(studentBean);
    }
}

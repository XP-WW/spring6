package com.xp.spring6.test;

import com.xp.spring6.bean.*;
import com.xp.spring6.service.CustomerService;
import com.xp.spring6.service.OrderService;
import com.xp.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 苏禾
 * @version 1.0
 * @title SpringDITest
 * @description <TODO description class purpose>
 * @create 2023/7/19 10:01
 * @since 1.0
 **/
public class SpringDITest {
    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }

    @Test
    public void testConstructorDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        CustomerService customerService = applicationContext.getBean("csBean1", CustomerService.class);
        customerService.save();

        CustomerService customerService1 = applicationContext.getBean("csBean2", CustomerService.class);
        customerService1.save();

        CustomerService customerService2 = applicationContext.getBean("csBean3", CustomerService.class);
        customerService2.save();
    }

    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.generate();
        OrderService orderServiceBean2 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderServiceBean2.generate();
    }

    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student student = applicationContext.getBean("studentBean", Student.class);
        System.out.println(student);

        Clazz clazz = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(clazz);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuQian = applicationContext.getBean("yuQian", QianDaYe.class);
        System.out.println(yuQian);
    }

    @Test
    public void testCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
    }

    @Test
    public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat cat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(cat);
    }

    @Test
    public void testSpecial(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathBean = applicationContext.getBean("MathBean", MathBean.class);
        System.out.println(mathBean);
    }
    @Test
    public void testGit(){
        System.out.println("git test .....");
        System.out.println("test 2 ......");
        System.out.println("test 3 ......");
        System.out.println("test 4 ......");
        System.out.println("test 5 ......");
        System.out.println("test 6 ......");
        System.out.println("test 7 ......");
    }
}

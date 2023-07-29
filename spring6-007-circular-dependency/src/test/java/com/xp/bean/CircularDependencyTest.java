package com.xp.bean;

import com.xp.spring.bean.Husband;
import com.xp.spring.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 苏禾
 * @version 1.0
 * @title CircularDependencyTest
 * @description <TODO description class purpose>
 * @create 2023/7/28 11:44
 * @since 1.0
 **/
public class CircularDependencyTest {
    @Test
    public void testCD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }


    @Test
    public void testCD2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        com.xp.spring.bean2.Husband h = applicationContext.getBean("h", com.xp.spring.bean2.Husband.class);
        System.out.println(h);
        com.xp.spring.bean2.Wife w = applicationContext.getBean("w", com.xp.spring.bean2.Wife.class);
        System.out.println(w);
    }
}

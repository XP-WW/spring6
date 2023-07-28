package com.xp.spring6.test;

import com.xp.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 苏禾
 * @version 1.0
 * @title SpringBeanScopeTest
 * @description <TODO description class purpose>
 * @create 2023/7/23 14:19
 * @since 1.0
 **/
public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        /**
         *1.spring默认情况下是如何管理bean的
         *  默认情况下bean是单例的
         *  在spring上下文初始化的时候实例化
         *  每一次调用getBean()方法的时候，都返回那个单例的对象
         * 2.当将bean的scope属性设置为prototype的bean
         *  每一次调用getBean()方法的时候，实例化该bean对象
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");

        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);

        SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb1);

        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb2);
    }
    @Test
    public void testThreadScope(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
                System.out.println(sb1);
            }
        }).start();
    }
}

package com.xp.spring6;

import cn.xp.spring6.config.Spring6Config;
import cn.xp.spring6.service.StudentService;
import com.xp.spring6.bean.Order;
import com.xp.spring6.bean.Student;
import com.xp.spring6.bean.User;
import com.xp.spring6.bean.Vip;
import com.xp.spring6.bean3.MyDataSource;
import com.xp.spring6.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xp.spring6.service.OrderService;

/**
 * @author 苏禾
 * @version 1.0
 * @title IoCAnnotationTest
 * @description <TODO description class purpose>
 * @create 2023/7/29 10:58
 * @since 1.0
 **/
public class IoCAnnotationTest {
    @Test
    public void testBeanComponent(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
        Order order = applicationContext.getBean("orderBean", Order.class);
        System.out.println(order);
        Student student = applicationContext.getBean("studentBean", Student.class);
        System.out.println(student);
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }
    @Test
    public void testChoose(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-choose.xml");
    }
    @Test
    public void testDIByAnnotation(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }
    @Test
    public void testAutoWired(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
    @Test
    public void testResource(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.delete();
    }

    @Test
    public void testNoXml(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = annotationConfigApplicationContext.getBean("studentService", StudentService.class);
        studentService.delete();
    }
}

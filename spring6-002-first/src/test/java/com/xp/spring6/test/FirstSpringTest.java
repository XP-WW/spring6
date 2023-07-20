package com.xp.spring6.test;

import com.xp.spring6.dao.UserDaoImplForMySQL;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 苏禾
 * @version 1.0
 * @title FirstSpringTest
 * @description <TODO description class purpose>
 * @create 2023/7/18 19:37
 * @since 1.0
 **/
public class FirstSpringTest {
    @Test
    public void testSpringCode() {
        //ApplicationContext 应用上下文 就是spring容器
        //是一个接口，接口下有很多的实现类，其中有一个实现类叫做：ClassPathXmlApplicationContext
        //ClassPathXmlApplicationContext是专门从类路径当中加载sping配置文件的一个spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
        UserDaoImplForMySQL userDaoBean = applicationContext.getBean("userDaoBean", UserDaoImplForMySQL.class);
        userDaoBean.insert();
        System.out.println(userDaoBean);
        Date nowTime = applicationContext.getBean("dateBean", Date.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(nowTime);
        System.out.println(format);
    }
}


package proxy.client;

import proxy.service.OrderService;
import proxy.service.OrderServiceImpl;
import proxy.service.TimeInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author 苏禾
 * @version 1.0
 * @title Test
 * @description <TODO description class purpose>
 * @create 2023/7/29 16:19
 * @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        OrderService target = new OrderServiceImpl();
        /*
        newProxyInstance翻译为新建代理对象
        动态生成类并new对象
        三个参数：
            ClassLoader loader类加载器 目标类类加载器
            Class<?>[] interfaces, 目标类和代理类要共同实现的接口
            InvocationHandler h   调用处理器，是一个接口，编写增强代码
        */
        OrderService proxyObj =(OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                target.getClass().getInterfaces(),
                                                new TimeInvocationHandler(target));
        proxyObj.generate();
        String name = proxyObj.getName();
        System.out.println(name);
    }
}

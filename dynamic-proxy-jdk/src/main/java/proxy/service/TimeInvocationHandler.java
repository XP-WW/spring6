package proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 苏禾
 * @version 1.0
 * @title TimeInvocationHandler
 * @description <TODO description class purpose>
 * @create 2023/7/29 17:09
 * @since 1.0
 **/
public class TimeInvocationHandler implements InvocationHandler {
    private Object target;

    public TimeInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  代理对象的引用
     * @param method 目标对象上的目标方法
     * @param args   目标方法上的实参
     * @return Object
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long begin = System.currentTimeMillis();
        Object retValue = method.invoke(target, args);
        System.out.println("增强二");
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
        return retValue;
    }
}

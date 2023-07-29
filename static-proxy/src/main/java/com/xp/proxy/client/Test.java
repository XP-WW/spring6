package com.xp.proxy.client;

import com.xp.proxy.service.OrderService;
import com.xp.proxy.service.OrderServiceImpl;
import com.xp.proxy.service.OrderServiceImplSub;
import com.xp.proxy.service.OrderServiceProxy;

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
        /*OrderService orderService = new OrderServiceImpl();
        orderService.generate();
        orderService.modify();
        orderService.detail();*/
        /*OrderService orderService = new OrderServiceImplSub();
        orderService.generate();
        orderService.modify();
        orderService.detail();*/
        OrderService target = new OrderServiceImpl();
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy(target);
        orderServiceProxy.generate();
        orderServiceProxy.modify();
        orderServiceProxy.detail();
    }
}

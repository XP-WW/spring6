package com.xp.proxy.service;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderServiceProxy
 * @description <TODO description class purpose>
 * @create 2023/7/29 16:30
 * @since 1.0
 **/
public class OrderServiceProxy implements OrderService{
    private OrderService target;

    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        target.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        target.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
    }
}

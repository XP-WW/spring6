package com.xp.proxy.service;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderServiceImpl
 * @description <TODO description class purpose>
 * @create 2023/7/29 16:16
 * @since 1.0
 **/
public class OrderServiceImpl implements OrderService{
    @Override
    public void generate() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单生成......");
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(544);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改.....");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(2134);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查看订单详情......");
    }
}

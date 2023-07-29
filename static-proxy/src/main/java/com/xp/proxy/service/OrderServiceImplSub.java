package com.xp.proxy.service;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderServiceImplSub
 * @description <TODO description class purpose>
 * @create 2023/7/29 16:23
 * @since 1.0
 **/
public class OrderServiceImplSub extends OrderServiceImpl {
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));
    }
}

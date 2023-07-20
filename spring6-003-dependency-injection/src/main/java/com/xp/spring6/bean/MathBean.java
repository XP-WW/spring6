package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title MathBean
 * @description <TODO description class purpose>
 * @create 2023/7/19 22:36
 * @since 1.0
 **/
public class MathBean {
    private String result;

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }

    public void setResult(String result) {
        this.result = result;
    }
}

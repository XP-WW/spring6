package com.xp.spring6.bean;

/**
 * @author 苏禾
 * @version 1.0
 * @title MyTime
 * @description <TODO description class purpose>
 * @create 2023/7/22 21:45
 * @since 1.0
 **/
public class MyTime {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

package com.xp.spring6.bean;

import javax.xml.crypto.Data;
import java.security.PrivateKey;
import java.util.Date;

/**
 * @author 苏禾
 * @version 1.0
 * @title Student
 * @description <TODO description class purpose>
 * @create 2023/7/27 22:10
 * @since 1.0
 **/
public class Student {
    private Date birth;

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}

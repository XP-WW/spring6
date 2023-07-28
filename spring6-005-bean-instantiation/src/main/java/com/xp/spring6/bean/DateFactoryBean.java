package com.xp.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 苏禾
 * @version 1.0
 * @title DateFactoryBean
 * @description <TODO description class purpose>
 * @create 2023/7/27 22:15
 * @since 1.0
 **/
public class DateFactoryBean implements FactoryBean<Date> {
    private String strDate;

    public DateFactoryBean(String strDate)  {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

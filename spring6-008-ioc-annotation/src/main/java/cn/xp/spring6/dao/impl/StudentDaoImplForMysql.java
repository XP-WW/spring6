package cn.xp.spring6.dao.impl;

import cn.xp.spring6.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author 苏禾
 * @version 1.0
 * @title StudentDaoImplForMysql
 * @description <TODO description class purpose>
 * @create 2023/7/29 12:10
 * @since 1.0
 **/
@Repository("studentDaoImplForMysql")
public class StudentDaoImplForMysql implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("Mysql数据库正在删除....");
    }
}

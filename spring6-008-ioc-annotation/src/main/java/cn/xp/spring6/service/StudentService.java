package cn.xp.spring6.service;

import cn.xp.spring6.dao.StudentDao;
import cn.xp.spring6.dao.impl.StudentDaoImplForMysql;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 苏禾
 * @version 1.0
 * @title StudentService
 * @description <TODO description class purpose>
 * @create 2023/7/29 12:11
 * @since 1.0
 **/
@Service("studentService")
public class StudentService {

    @Resource
    private StudentDao studentDao;
    public void delete(){
        studentDao.deleteById();
    }
}

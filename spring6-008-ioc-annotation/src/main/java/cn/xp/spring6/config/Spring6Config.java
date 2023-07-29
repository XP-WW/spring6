package cn.xp.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 苏禾
 * @version 1.0
 * @title Spring6Config
 * @description <TODO description class purpose>
 * @create 2023/7/29 12:23
 * @since 1.0
 **/
@Configuration
@ComponentScan({"cn.xp.spring6.dao","cn.xp.spring6.service"})
public class Spring6Config {
}

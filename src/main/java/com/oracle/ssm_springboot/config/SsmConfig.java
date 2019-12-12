package com.oracle.ssm_springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/10/9 12:07
 * @Version: 1.0
 * spring-mybatis.xml
 **/
@Configuration
@ComponentScan("com.oracle")
@MapperScan("com.oracle.ssm_springboot.mapper")
@EnableTransactionManagement
public class SsmConfig {
}

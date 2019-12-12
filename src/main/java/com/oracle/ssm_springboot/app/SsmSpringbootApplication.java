package com.oracle.ssm_springboot.app;

import com.oracle.ssm_springboot.config.RedisConfig;
import com.oracle.ssm_springboot.config.SsmConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
  spring.xml文件
  **/
@SpringBootApplication
@Import({SsmConfig.class, RedisConfig.class})
public class SsmSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmSpringbootApplication.class, args);
	}

}

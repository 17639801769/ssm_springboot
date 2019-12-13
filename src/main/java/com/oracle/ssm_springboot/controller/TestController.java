package com.oracle.ssm_springboot.controller;

import com.oracle.ssm_springboot.model.SysUser;
import com.oracle.ssm_springboot.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: gaoyun
 * @CreateDate: 2019/10/9 14:16
 * @Version: 1.0
 **/
@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private SysUserService sysUserService;
    //redisTemplate会自动创建，springboot自动配置的机制，会自动创建redis连接池以及redisTemplate
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/test")
    public String test(int id, HttpServletRequest request,HttpSession session){
        SysUser user=sysUserService.findUserById(id);
        request.setAttribute("user", user);
        redisTemplate.boundValueOps("test").set("test");
        String value= (String) redisTemplate.boundValueOps("test").get();
        request.setAttribute("test", value);
        session.setAttribute("user", user);
        logger.info(request.getRemoteAddr());
        return "/index/test";
    }

}

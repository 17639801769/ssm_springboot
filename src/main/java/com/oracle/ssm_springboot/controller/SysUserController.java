package com.oracle.ssm_springboot.controller;

import com.oracle.ssm_springboot.model.SysUser;
import com.oracle.ssm_springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/10/9 11:30
 * @Version: 1.0
 **/
//restController注解是一个组合注解  @controller  @responseBody
@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/test")
    public SysUser test(int id, HttpServletRequest request){
        SysUser user=sysUserService.findUserById(id);
        return user;

    }
}

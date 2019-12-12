package com.oracle.ssm_springboot.service;

import com.oracle.ssm_springboot.model.SysUser;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/10/9 11:28
 * @Version: 1.0
 **/
public interface SysUserService {
    SysUser findUserById(int id);
}

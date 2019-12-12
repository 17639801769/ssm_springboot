package com.oracle.ssm_springboot.mapper;


import com.oracle.ssm_springboot.base.BaseMapper;
import com.oracle.ssm_springboot.model.SysUser;

public interface SysUserMapper extends BaseMapper<SysUser> {


    SysUser findUserByLoginName(String loginName);

    SysUser findUserByPhone(String phone);

    SysUser findUserByEmail(String email);
}
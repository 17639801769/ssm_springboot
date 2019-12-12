package com.oracle.ssm_springboot.service.impl;

import com.oracle.ssm_springboot.mapper.SysUserMapper;
import com.oracle.ssm_springboot.model.SysUser;
import com.oracle.ssm_springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/10/9 11:28
 * @Version: 1.0
 **/
@Service

public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    @Cacheable("redisCache")
    public SysUser findUserById(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}

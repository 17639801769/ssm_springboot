package com.oracle.ssm_springboot.config;

import com.oracle.ssm_springboot.cache.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/10/9 15:03
 * @Version: 1.0
 **/
@Configuration
@EnableCaching
public class RedisConfig {
    @Autowired
    private RedisTemplate redisTemplate;

    @Bean
    public SimpleCacheManager cacheManager(){
        SimpleCacheManager cacheManager=new SimpleCacheManager();
        List<Cache> list=new ArrayList();
        RedisCache cache=new RedisCache();
        cache.setName("redisCache");
        cache.setRedisTemplate(redisTemplate);
        list.add(cache);
        cacheManager.setCaches(list);
        return  cacheManager;
    }


}

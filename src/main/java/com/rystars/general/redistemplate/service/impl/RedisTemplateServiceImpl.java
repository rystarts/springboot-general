package com.rystars.general.redistemplate.service.impl;

import com.rystars.general.redistemplate.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class RedisTemplateServiceImpl implements RedisTemplateService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String getRankInfo() {
        redisTemplate.opsForValue().set("hello","hello world!!");
        String hello = (String)redisTemplate.opsForValue().get("hello");
        return hello;
    }
}

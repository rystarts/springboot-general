package com.rystars.general.redistemplate.controller.impl;

import com.rystars.general.redistemplate.controller.RedisTemplateController;
import com.rystars.general.redistemplate.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

@RestController
public class RedisTemplateControllerImpl implements RedisTemplateController {

    @Autowired
    private RedisTemplateService redisTemplateService;


    @Override
    @GetMapping("/rank")
    public String getRankList() {
        return redisTemplateService.getRankInfo();
    }
}

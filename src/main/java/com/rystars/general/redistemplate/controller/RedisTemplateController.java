package com.rystars.general.redistemplate.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/redis-template")
public interface RedisTemplateController {

    String getRankList();

}

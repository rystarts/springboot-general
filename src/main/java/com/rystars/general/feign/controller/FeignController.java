package com.rystars.general.feign.controller;

import com.rystars.general.feign.bean.LimsTestDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feign")
public interface FeignController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String helloFeign();

    @RequestMapping(value = "/getparam", method = RequestMethod.GET)
    String getParam();

    @RequestMapping(value = "/getbody", method = RequestMethod.GET)
    LimsTestDto getBody();
}

package com.rystars.general.feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feign")
public interface FeignController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String helloFeign();

}

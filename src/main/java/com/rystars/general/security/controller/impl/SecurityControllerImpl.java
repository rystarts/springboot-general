package com.rystars.general.security.controller.impl;

import com.rystars.general.security.controller.SecurityController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityControllerImpl implements SecurityController {

    @Override
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello world!";
    }
}

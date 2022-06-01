package com.rystars.general.feign.controller.impl;

import com.rystars.general.feign.controller.FeignController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignControllerImpl implements FeignController {

    public String helloFeign() {
        return "hello";
    }
}

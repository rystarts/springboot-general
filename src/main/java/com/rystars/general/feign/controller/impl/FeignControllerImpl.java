package com.rystars.general.feign.controller.impl;

import com.rystars.general.feign.bean.LimsTestDto;
import com.rystars.general.feign.client.FeignClientTransfer;
import com.rystars.general.feign.controller.FeignController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignControllerImpl implements FeignController {

    @Autowired
    private FeignClientTransfer feignClientTransfer;

    @Override
    public String helloFeign() {
        return "hello";
    }

    @Override
    public String getParam() {
        return feignClientTransfer.sendValiCodeMessage("this is the param sent by the client ");
    }

    @Override
    public LimsTestDto getBody() {
        LimsTestDto limsTestDto = new LimsTestDto();
        limsTestDto.setId("4455");
        limsTestDto.setMethodNo("5566");
        limsTestDto.setTestName("test");
        return feignClientTransfer.sendValiCodeMessage(limsTestDto);
    }
}

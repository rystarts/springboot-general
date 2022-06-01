package com.rystars.general.httpclient.controller;

import com.rystars.general.feign.bean.LimsTestDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.net.URISyntaxException;

@RequestMapping("/httpclient")
public interface HttpClientController {

    @RequestMapping(value = "/getbody", method = RequestMethod.GET)
    LimsTestDto getBody() throws IOException;

    @RequestMapping(value = "/getparam", method = RequestMethod.GET)
    String getParam() throws IOException, URISyntaxException;
}

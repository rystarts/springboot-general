package com.rystars.general.resttemplate.controller.impl;

import com.rystars.general.feign.bean.LimsTestDto;
import com.rystars.general.resttemplate.controller.RestTemplateController;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestTemplateControllerImpl implements RestTemplateController {

    @Value("${feign.lims.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public LimsTestDto getBody() throws IOException {
        LimsTestDto limsTestDto = new LimsTestDto();
        limsTestDto.setId("4455");
        limsTestDto.setMethodNo("5566");
        limsTestDto.setTestName("test");
        String ur = url + "/open/lims/css/sendvalicodemessage-body";
        return restTemplate.postForObject(ur, limsTestDto, LimsTestDto.class);
    }

    @Override
    public String getParam() throws IOException, URISyntaxException {
        String ur = url + "/open/lims/css/sendvalicodemessage-param";
        List<NameValuePair> nvp = new ArrayList<>();
        nvp.add(new BasicNameValuePair("param","this is httpclient param"));
        URI build = new URIBuilder(ur).addParameters(nvp).build();
        return restTemplate.getForObject(build.toString(),String.class);
    }
}

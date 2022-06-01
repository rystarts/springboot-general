package com.rystars.general.httpclient.controller.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rystars.general.feign.bean.LimsTestDto;
import com.rystars.general.httpclient.bean.HttpClientUtil;
import com.rystars.general.httpclient.controller.HttpClientController;
import javafx.util.Pair;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HttpClientControllerImpl implements HttpClientController {

    @Value("${feign.lims.url}")
    private String url;

    @Override
    public LimsTestDto getBody() throws IOException {
        LimsTestDto limsTestDto = new LimsTestDto();
        limsTestDto.setId("4455");
        limsTestDto.setMethodNo("5566");
        limsTestDto.setTestName("test");
        String o = HttpClientUtil.sentHttpPost(url + "/open/lims/css/sendvalicodemessage-body", (JSONObject) JSONObject.toJSON(limsTestDto));
        return JSON.parseObject(o,LimsTestDto.class);
    }

    @Override
    public String getParam() throws IOException, URISyntaxException {
        List<NameValuePair> nvp = new ArrayList<>();
        nvp.add(new BasicNameValuePair("param","this is httpclient param"));
        return HttpClientUtil.sentHttpGet(url + "/open/lims/css/sendvalicodemessage-param", nvp);
    }

}

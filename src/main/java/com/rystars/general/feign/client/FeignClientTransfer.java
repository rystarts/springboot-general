package com.rystars.general.feign.client;

import com.rystars.general.feign.bean.LimsTestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feignClient", url = "${feign.lims.url}")
public interface FeignClientTransfer {

    @PostMapping("/open/lims/css/sendvalicodemessage-param")
    String sendValiCodeMessage(@RequestParam String param);

    @PostMapping("/open/lims/css/sendvalicodemessage-body")
    LimsTestDto sendValiCodeMessage(@RequestBody LimsTestDto limsTestDto);

}

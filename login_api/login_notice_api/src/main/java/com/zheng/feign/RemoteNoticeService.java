package com.zheng.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author 郑超
 * @create 2021/6/8
 */
// value 此处为服务提供方的服务名 contextId 可以让相同服务名的bean不产生冲突
@FeignClient(value = "notice-9002", contextId = "remoteNoticeService")
public interface RemoteNoticeService {

    @PostMapping("/notice/sms/send")
    String sendMsg(@RequestBody Map<String, Object> code);
}

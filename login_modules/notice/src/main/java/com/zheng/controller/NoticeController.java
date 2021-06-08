package com.zheng.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 处理远程短信请求
 *
 * @author 郑超
 * @create 2021/6/8
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @PostMapping("/sms/send")
    public String doSend(@RequestBody Map<String, Object> msg) {
        System.out.println(msg);
        return "send ok";
    }
}

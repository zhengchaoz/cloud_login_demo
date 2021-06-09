package com.zheng.controller;

import com.zheng.annotation.RequiredLog;
import com.zheng.feign.RemoteNoticeService;
import com.zheng.pojo.LoginVo;
import com.zheng.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 郑超
 * @create 2021/6/8
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    // 基于此接口中的方法进行远程通知服务的调用
    @Autowired
    private RemoteNoticeService remoteNoticeService;

    @PostMapping("/register")
    public String doRegister(@RequestBody Member member) {
        System.out.println(member);

        Map<String, Object> map = new HashMap<>();
        map.put("code", "1234");
        map.put("mobile", "zsdc");
        return remoteNoticeService.sendMsg(map);

//        return "register ok";
    }

    @RequiredLog
    @PostMapping("/login")
    public String doLogin(@RequestBody LoginVo loginVo) {
        return "login ok";
    }
}

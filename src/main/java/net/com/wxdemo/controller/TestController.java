package net.com.wxdemo.controller;

import net.com.wxdemo.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private WeChatConfig weChatConfig;
    @GetMapping("test_config")
    public String Test(){
        System.out.println(weChatConfig.getAppid());
        return "完成测试";
    }
}

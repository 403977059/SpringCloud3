package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanqh
 * @date 2018/01/19 9:22
 * @description:
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${abcc}")
    private String abcc;

    @GetMapping("/get_name")
    public String name(){
        return "abcc:"+abcc;
    }

}

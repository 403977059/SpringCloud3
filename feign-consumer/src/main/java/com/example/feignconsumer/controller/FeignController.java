package com.example.feignconsumer.controller;

import com.example.feignconsumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value="feign-consumer")
    public String consumer(){
        return feignService.product();
    }

}

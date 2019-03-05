package com.example.feignconsumer.service.impl;

import com.example.feignconsumer.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class productServiceFailback implements FeignService {

    @Override
    public String product(){
        return "error";
    }

}

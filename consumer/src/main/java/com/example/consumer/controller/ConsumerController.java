package com.example.consumer.controller;

import com.example.consumer.service.ConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ConsumerServiceImpl consumerService;

    @RequestMapping(value="ribbon-consumber")
    public String index(){
        return restTemplate.getForEntity("http://product/product",String.class).getBody();
    }

    @RequestMapping(value="hystrix-consumber")
    public String index2() throws Exception{
        return consumerService.consumerService();
    }

}
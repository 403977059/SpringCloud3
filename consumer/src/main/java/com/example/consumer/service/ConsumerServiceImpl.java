package com.example.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "conFallback")
    public String consumerService() throws Exception{
//        Thread.sleep(10000);
        return restTemplate.getForEntity("http://product/product",String.class).getBody();
    }

    public String conFallback(){
        return "error";
    }

}

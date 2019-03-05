package com.example.feignconsumer.service;

import com.example.feignconsumer.service.impl.productServiceFailback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product",fallback = productServiceFailback.class)
public interface FeignService {

    @RequestMapping("product")
    String product();

}

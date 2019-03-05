package com.example.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private Logger logger = LoggerFactory.getLogger (ProductController.class);

    @RequestMapping(value="product")
    public String index() throws Exception{
        Thread.sleep(8000);
        logger.info("request product server success.");
        return "request product server success.";
    }

}
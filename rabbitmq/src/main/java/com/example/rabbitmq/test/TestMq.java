package com.example.rabbitmq.test;

import com.example.rabbitmq.RabbitmqApplication;
import com.example.rabbitmq.controller.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
        public class TestMq {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        sender.send();
    }

}

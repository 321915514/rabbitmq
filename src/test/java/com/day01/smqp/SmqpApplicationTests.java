package com.day01.smqp;

import com.day01.smqp.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmqpApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {
        Map<String,Object> map=new HashMap<>();
        map.put("msg","第4封消息");
        map.put("data", Arrays.asList("hello world",123,true));
        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",new Book("红楼梦","曹雪芹"));
    }
    @Test
    public void  getMessage(){
        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o);
    }

}

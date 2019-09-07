package com.day01.smqp.service;

import com.day01.smqp.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @RabbitListener(queues="atguigu.news")
    public void  getBook(Book book){
        System.out.println("收到消息"+book);
    }
}

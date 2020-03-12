package com.ctp.ribbonconsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:16338
 * package:com.ctp.ribbonconsume.controller
 * Description:TODO
 *
 * @date:2020/3/7 - 10:31
 * @Author:chaotianpeng
 */
@RestController
@RequestMapping("/ceshi")
public class HelloController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/hello")
    public String helloConsume(){
        String body = restTemplate.getForEntity("http://EUREKA-CLIENT-HELLO-SERVICE/helloController/hello", String.class).getBody();
        return body;
    }
}

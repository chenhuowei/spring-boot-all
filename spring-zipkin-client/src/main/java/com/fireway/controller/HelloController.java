package com.fireway.controller;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:04
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }


    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi(@RequestParam(value = "name", defaultValue = "fireway") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name", defaultValue = "fireway") String name) {
        return this.restTemplate.getForObject("http://localhost:8762/hi?name-zipkin",String.class);
    }



}

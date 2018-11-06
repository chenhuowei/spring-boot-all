package com.fireway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:04
 * @Description:
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${foo}")
    private String foo;

    @GetMapping("hi")
    public String hi() {
        return "hi ," +foo;
    }



}

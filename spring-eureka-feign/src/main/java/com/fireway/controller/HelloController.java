package com.fireway.controller;

import com.fireway.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:02
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hi")
    public String hi(@RequestParam(defaultValue = "feign")String name){
        return  helloService.getServiceFromOne(name);
    }

}

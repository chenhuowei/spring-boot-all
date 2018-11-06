package com.fireway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 14:13
 * @Description:
 */
@Controller
public class SystemController {


    @GetMapping("/")
    public String swaggerApi(){
        return  "redirect:/doc.html";
    }

}

package com.fireway.service;

import org.springframework.stereotype.Component;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 11:36
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements HelloService {

    @Override
    public String getServiceFromOne(String name) {
        return name+",sorry, it is error! ";
    }
}

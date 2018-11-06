package com.fireway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/6 10:59
 * @Description:
 */
@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface HelloService {

    @GetMapping("hi")
    public String getServiceFromOne(@RequestParam(name = "name") String name);



}

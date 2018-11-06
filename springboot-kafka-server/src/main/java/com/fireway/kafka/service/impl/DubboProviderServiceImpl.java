package com.fireway.kafka.service.impl;

import com.fireway.kafka.service.DubboProviderService;
import org.springframework.stereotype.Service;

/**
 * @Author: chenhuowei
 * @Date: 2018/10/17 11:24
 * @Description:
 */
@Service
public class DubboProviderServiceImpl implements DubboProviderService {

    @Override
    public String providerStr(String str) {

        return "服务端提供返回的信息："+str+"(from client)";
    }
}

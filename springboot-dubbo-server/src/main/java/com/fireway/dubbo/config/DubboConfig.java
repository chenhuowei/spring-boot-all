package com.fireway.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: chenhuowei
 * @Date: 2018/10/17 15:28
 * @Description:
 */

@Configuration
@ImportResource({ "classpath:dubbo-provider.xml" })
public class DubboConfig {
}

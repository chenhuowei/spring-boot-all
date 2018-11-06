package com.fireway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:19
 * @Description:
 */
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
@SpringBootApplication
public class Application {

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
    }
}

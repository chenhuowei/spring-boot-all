package com.fireway.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenhuowei
 * @Date: 2018/10/10 09:37
 * @Description:
 */
@SpringBootApplication
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
        logger.info("dubbo server start");

    }

}

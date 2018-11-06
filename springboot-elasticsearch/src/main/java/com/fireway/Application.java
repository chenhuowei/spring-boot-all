package com.fireway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:19
 * @Description:
 */
@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
    }
}

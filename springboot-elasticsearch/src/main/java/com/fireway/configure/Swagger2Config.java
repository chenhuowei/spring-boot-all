package com.fireway.configure;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 14:49
 * @Description:
 */
@Configurable
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).groupName("ElasticSearch").select()
                .apis(RequestHandlerSelectors.basePackage("com.fireway.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("swagger RESTful APIs")
                .description("ElasticSearch RESTful APIs")
                .termsOfServiceUrl("http://www.fireway.com/")
                .contact(new Contact("fireway","",""))
                .version("1.0").build();
    }


}

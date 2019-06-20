package com.ilidan.spring_boot_demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类信息
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        System.out.println("HelloWorldConfiguration#helloWorld invoked!");
        return "Hello, world!";
    }

}

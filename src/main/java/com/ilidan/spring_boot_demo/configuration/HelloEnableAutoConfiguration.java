package com.ilidan.spring_boot_demo.configuration;

import com.ilidan.spring_boot_demo.annotation.EnableHelloWorld;
import com.ilidan.spring_boot_demo.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配配置
 */
@Configuration//模式注解装配
@EnableHelloWorld//@Enable注解装配
@ConditionOnSystemProperty(name = "user.name", value = "lidan_Y")//条件注解装配
public class HelloEnableAutoConfiguration {

    @Bean
    public String helloConfig(){
        System.out.println("HelloEnableAutoConfiguration#helloConfig invoked!");
        return "hello configuration!";
    }

}

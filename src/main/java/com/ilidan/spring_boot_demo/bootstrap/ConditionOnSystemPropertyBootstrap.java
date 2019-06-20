package com.ilidan.spring_boot_demo.bootstrap;

import com.ilidan.spring_boot_demo.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 条件注解启动类
 */
//@ConditionOnSystemProperty(name = "user.name", value = "lidan_Y")
public class ConditionOnSystemPropertyBootstrap {

    @Bean
    @ConditionOnSystemProperty(name = "user.name", value = "lidan_Y")
    public String helloWorld(){
        return "hello world!";
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(ConditionOnSystemPropertyBootstrap.class)
                        .web(WebApplicationType.NONE).run(args);
        String helloWorld = applicationContext.getBean("helloWorld", String.class);
        System.out.println(helloWorld);

        applicationContext.close();
    }

}

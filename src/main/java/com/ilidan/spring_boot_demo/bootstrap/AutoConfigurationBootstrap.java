package com.ilidan.spring_boot_demo.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自动装配
 * {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration}
 */
@EnableAutoConfiguration
public class AutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(AutoConfigurationBootstrap.class)
                        .web(WebApplicationType.NONE).run(args);
        //关闭上下文
        applicationContext.close();

    }

}

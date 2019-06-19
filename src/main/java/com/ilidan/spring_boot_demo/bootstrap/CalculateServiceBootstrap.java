package com.ilidan.spring_boot_demo.bootstrap;

import com.ilidan.spring_boot_demo.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动类
 */
@SpringBootApplication(scanBasePackages = "com.ilidan.spring_boot_demo.service.impl")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                        .web(WebApplicationType.NONE)
                        .profiles("java8")
                        .run(args);
        CalculateService calculateService = applicationContext.getBean(CalculateService.class);
        System.out.println("calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)："
                + calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

}

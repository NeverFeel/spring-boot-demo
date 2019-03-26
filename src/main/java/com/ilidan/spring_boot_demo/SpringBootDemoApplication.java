package com.ilidan.spring_boot_demo;

import com.ilidan.spring_boot_demo.factory.DefaultYamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:config/application-redis.yml","classpath:config/application-redis2.yml"},
        ignoreResourceNotFound = false, encoding = "UTF-8", name = "application-redis.yml",
        factory = DefaultYamlPropertySourceFactory.class)
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}

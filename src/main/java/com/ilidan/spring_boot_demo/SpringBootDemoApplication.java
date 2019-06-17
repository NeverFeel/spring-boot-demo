package com.ilidan.spring_boot_demo;

import com.ilidan.spring_boot_demo.config.DataSourceConfig;
import com.ilidan.spring_boot_demo.factory.DefaultYamlPropertySourceFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.applet.AppletContext;

@PropertySource(value = {"classpath:config/application-redis.yml","classpath:config/application-redis2.yml"},
        ignoreResourceNotFound = false, encoding = "UTF-8", name = "application-redis.yml",
        factory = DefaultYamlPropertySourceFactory.class)
@SpringBootApplication
@EnableConfigurationProperties(DataSourceConfig.class)
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    /**
     * 该方法会在应用启动后调用
     * @param context 上下文对象
     * @return
     */
    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){
        return args -> System.out.println("------------->"+context.getWebServer().getClass().getName());
    }

}

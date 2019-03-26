package com.ilidan.spring_boot_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class ApplicationConfig {

    @Bean
    public DefaultUserConfig defaultUserConfig() {
        return new DefaultUserConfig();
    }

    @Bean
    public DataSourceConfig dataSourceConfig() {
        return new DataSourceConfig();
    }

    @Bean
    public RedisConfig redisConfig() {
        return new RedisConfig();
    }
}

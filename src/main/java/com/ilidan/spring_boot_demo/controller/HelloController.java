package com.ilidan.spring_boot_demo.controller;

import com.ilidan.spring_boot_demo.config.DataSourceConfig;
import com.ilidan.spring_boot_demo.config.DefaultUserConfig;
import com.ilidan.spring_boot_demo.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HelloController {

    @Value("${myConfig.myObject.myName}")
    private String name;

    @Value("${myConfig.myObject.myAge}")
    private int age;

    @Autowired
    private DefaultUserConfig defaultUserConfig;

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public DefaultUserConfig getUserInfo() {
        return defaultUserConfig;
    }

    @RequestMapping(value = "/getDataSourceConfig", method = RequestMethod.GET)
    public DataSourceConfig getDataSourceConfig() {
        return dataSourceConfig;
    }

    @RequestMapping(value = "/getRedisConfig", method = RequestMethod.GET)
    public RedisConfig getRedisConfig() {
        String ip = environment.getProperty("config.redis.ip");
        String port = environment.getProperty("config.redis.port");
        String auth = environment.getProperty("config.redis.auth");
        System.out.println(ip+","+port+","+auth);
        return redisConfig;
    }

}

package com.ilidan.spring_boot_demo.config;

import org.springframework.beans.factory.annotation.Value;

//可以不提供set方法，但是必须要有get方法
public class DefaultUserConfig {

    @Value("${myConfig.myObject.myName}")
    private String name;

    @Value("${myConfig.myObject.myAge}")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

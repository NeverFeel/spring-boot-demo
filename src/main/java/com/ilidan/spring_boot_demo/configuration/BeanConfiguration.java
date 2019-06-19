package com.ilidan.spring_boot_demo.configuration;

import com.ilidan.spring_boot_demo.bean.Cat;
import com.ilidan.spring_boot_demo.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfiguration {

    @Bean
    @Profile("pro")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setColor("黑色");
        dog.setName("二哈");
        return dog;
    }

    @Bean
    @Profile("dev")
    public Cat cat() {
        Cat cat = new Cat();
        cat.setColor("白色");
        cat.setName("咖啡猫");
        return cat;
    }

}

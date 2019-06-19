package com.ilidan.spring_boot_demo.bootstrap;

import com.ilidan.spring_boot_demo.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring application 引导类
 */
@ComponentScan(basePackages = "com.ilidan.spring_boot_demo.repository")
public class SpringApplicationBootstrap {

    public static void main(String[] args) {

        //创建spring上下文
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(SpringApplicationBootstrap.class)
                .web(WebApplicationType.NONE)//设置为非web应用
                .run(args);

        //获取bean
        MyFirstRepository myFirstRepository = context.
                getBean("myFirstRepository", MyFirstRepository.class);

        //判断bean是否存在
        System.out.println("myFirstRepository bean : "+ myFirstRepository);

    }

}

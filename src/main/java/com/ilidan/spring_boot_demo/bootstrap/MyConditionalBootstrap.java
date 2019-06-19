package com.ilidan.spring_boot_demo.bootstrap;

import com.ilidan.spring_boot_demo.bean.Cat;
import com.ilidan.spring_boot_demo.bean.Dog;
import com.ilidan.spring_boot_demo.configuration.BeanConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ilidan_Y
 * @Package com.ilidan.spring_boot_demo.bootstrap
 * @Description:
 * @date 2019/6/19
 * @Modified by:
 */
@ComponentScan(basePackages = "com.ilidan.spring_boot_demo.configuration")
public class MyConditionalBootstrap {

    public static void main(String[] args) {

        //1.通过springboot的方式
        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(MyConditionalBootstrap.class).
                        profiles("dev").web(WebApplicationType.NONE).run(args);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat);
//        Dog dog = applicationContext.getBean("dog", Dog.class);
//        System.out.println(dog);
        applicationContext.close();

        System.out.println("---------------------");

        //2.通过spring的方式
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(BeanConfiguration.class);
        configApplicationContext.getEnvironment().setActiveProfiles("dev");
        configApplicationContext.refresh();
        Cat cat2 = configApplicationContext.getBean("cat", Cat.class);
        System.out.println(cat2);
//        Dog dog = applicationContext.getBean("dog", Dog.class);
//        System.out.println(dog);
        configApplicationContext.close();

    }

}

package com.ilidan.spring_boot_demo.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 一级{@link org.springframework.stereotype.Repository}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";

}

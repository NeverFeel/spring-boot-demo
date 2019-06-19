package com.ilidan.spring_boot_demo.annotation;

import java.lang.annotation.*;

/**
 * 二级{@link FirstLevelRepository}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    String value() default "";

}

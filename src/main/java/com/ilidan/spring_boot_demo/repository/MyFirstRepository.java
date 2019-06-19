package com.ilidan.spring_boot_demo.repository;

import com.ilidan.spring_boot_demo.annotation.SecondLevelRepository;

/**
 * 第一个测试仓储
 */
//@FirstLevelRepository("myFirstRepository")
@SecondLevelRepository("myFirstRepository")
public class MyFirstRepository {
}

package com.ilidan.spring_boot_demo.service.impl;

import com.ilidan.spring_boot_demo.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * java 8 lambda实现{@link CalculateService}
 */
@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("-----------java 8 lambda-----------");
        return Stream.of(values).reduce(0, Integer::sum);
    }
}

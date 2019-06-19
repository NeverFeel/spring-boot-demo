package com.ilidan.spring_boot_demo.service.impl;

import com.ilidan.spring_boot_demo.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * java 7 for 实现{@link CalculateService}
 */
@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("-----------java 7 for-----------");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}

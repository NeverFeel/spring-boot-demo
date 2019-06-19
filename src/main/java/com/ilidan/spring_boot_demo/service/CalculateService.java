package com.ilidan.spring_boot_demo.service;

/**
 * 计算相关的服务类
 */
public interface CalculateService {

    /**
     * 求和
     * @param values 被操作的数
     * @return 结果值
     */
    Integer sum(Integer... values);

}

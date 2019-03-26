package com.ilidan.spring_boot_demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

//需要提供getter和setter，否则启动时会报错
@ConfigurationProperties(prefix = "config.mysql")
public class DataSourceConfig {

    private String driver;

    private String url;

    private String username;

    private String password;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

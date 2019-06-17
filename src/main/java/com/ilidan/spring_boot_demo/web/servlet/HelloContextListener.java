package com.ilidan.spring_boot_demo.web.servlet;

/**
 * spring boot对Listener的支持
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * spring boot对listener的支持
 */
@WebListener("myContextListener")
public class HelloContextListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("HelloListener contextDestroyed method invoked!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("HelloListener contextInitialized method invoked!");
    }

}

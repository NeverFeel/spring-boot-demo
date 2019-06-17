package com.ilidan.spring_boot_demo.web.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * spring boot对listener的支持
 */
public class HelloListener implements HttpSessionListener{

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSessionListener.super.sessionCreated(se);
        System.out.println("HelloListener sessionCreated method invoked!");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HelloListener sessionDestroyed method invoked!");
    }
}

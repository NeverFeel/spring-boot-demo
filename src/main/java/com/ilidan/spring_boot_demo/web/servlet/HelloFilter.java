package com.ilidan.spring_boot_demo.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * spring boot对filter的支持
 */
@WebFilter(urlPatterns = "/my/*", filterName = "helloFilter")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("helloFilter init method invoked!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println(servletRequest.getRemoteHost());
        System.out.println("helloFilter doFilter method invoked!");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("helloFilter destroy method invoked!");
    }
}

package com.ilidan.spring_boot_demo.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * spring boot 对异步servlet的支持
 */
@WebServlet(urlPatterns = "/async/servlet", asyncSupported = true)
public class AsyncHelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        //注意这个地方要开启异步模式，否则会抛出异常java.lang.IllegalStateException:
        // It is illegal to call this method if the current request is not in asynchronous mode (i.e. isAsyncStarted() returns false)
        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(() -> {
            try {
                resp.getWriter().println("hello async servlet");
                //触发完成
                asyncContext.complete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}

package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("creating object ...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing ...");

        // Set the content type of the response.
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<h2>Providing the Services...</h2>");
        writer.println("<h3>Today's Time and Date is : " + new Date().toString() + "</h3>");
    }

    @Override
    public String getServletInfo() {
        return "created by aniket";
    }

    @Override
    public void destroy() {
        System.out.println("going to destory servlet object");
    }

}

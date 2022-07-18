package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("this is get method....");   //for console

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.print("<h1>this is get method of the servlet.</h1>");

    }

}

package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class SuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();

        pw.println("This is a success servlet.");
        pw.println("<h2>YOu have accepted terms and conditions.</h2>");
        
        
    }
}

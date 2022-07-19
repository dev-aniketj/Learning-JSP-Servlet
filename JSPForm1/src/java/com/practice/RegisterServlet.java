package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
        pw.print("this is the Response Page.");

        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String condition = request.getParameter("conditions");

        if (condition == null) {
            pw.print("<h3>You have not accepted terms and conditions.</h3>");
            
            // I want to include output of index.html
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            // include
            rd.include(request, response);
            
            
        } else {
            pw.print("<br><h3>Congrats, you account is Successfully Register.</h3>");
            pw.print("<br>User Name : " + name);
            pw.print("<br>User Password : " + password);
            pw.print("<br>User Email : " + email);
            pw.print("<br>User Gender : " + gender);
            pw.print("<br>User Course : " + course);
            
            // JDBC
            // saved to do...
            
            RequestDispatcher rd = request.getRequestDispatcher("success"); //url pattern
            rd.forward(request, response);
            
            
        }
    }
}

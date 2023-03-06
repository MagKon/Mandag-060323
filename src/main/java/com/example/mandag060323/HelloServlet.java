package com.example.mandag060323;

import java.io.*;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println(
                "<html>" +
                    "<body> " +
                        "<h1>" + message + "</h1> " +
                        "<br>" +
                        "<a href=\"index.jsp\">Tilbage</a>" +
                    "</body>" +
                "</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        //Read post request and set message
        String fname = request.getParameter("First Name");
        String lname = request.getParameter("Last Name");
        try {
            if ((fname != null && !fname.equals("")) && (lname != null && !lname.equals(""))) {
                message = "Hello " + fname + " " + lname;
                request.setAttribute("message", message);
                request.getRequestDispatcher("welcome.jsp").forward(request, response);
            }
            else {
                request.setAttribute("message", "Please enter a name");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        catch (Exception e) {
            response.sendError(500, e.getMessage());
        }
    }

    public void destroy() {
    }
}
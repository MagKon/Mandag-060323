package com.example.mandag060323;

import java.io.*;

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
        message = request.getReader().readLine();
        if (message.contains("John") && message.contains("Doe")) {
            message = "Hello John Doe";
        }
        else {
//            response.sendError(400, "Bad Request");
            response.sendRedirect("PageNotAllowed.jsp");
        }
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

    public void destroy() {
    }
}
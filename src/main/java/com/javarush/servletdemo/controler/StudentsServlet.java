package com.javarush.servletdemo.controler;

import com.javarush.servletdemo.service.StudentsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.*;

@WebServlet(name = "studentServlet", value = "/students")
public class StudentsServlet extends HttpServlet {

    private final StudentsService studentsService = StudentsService.getInstance();


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //response.setContentType("text/html");

        String pathInfo = request.getPathInfo();
        if (pathInfo != null) {
            if (pathInfo.equalsIgnoreCase("/new")) {
                request.getRequestDispatcher("/new-student.jsp").forward(request, response);
                ;
                return;
            }
        }
        request.setAttribute("students", studentsService.findAll());
        request.getRequestDispatcher("/students.jsp").forward(request, response);


    }

    public void destroy() {
    }
}
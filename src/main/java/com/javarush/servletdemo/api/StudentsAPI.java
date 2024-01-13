package com.javarush.servletdemo.api;

import java.io.*;

import com.google.gson.Gson;
import com.javarush.servletdemo.model.Student;
import com.javarush.servletdemo.service.StudentsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet(name = "StudentsAPI", value = "/api/students")
public class StudentsAPI extends HttpServlet {

    private final StudentsService studentsService = StudentsService.getInstance();
    private static final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.getWriter().write(studentsService.findAll().toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentJson = request.getReader().lines()
                .collect(Collectors.joining());
            //    .reduce("", (accumulator, actual) -> accumulator + actual);  можна і так
        Student student = gson.fromJson(studentJson, Student.class);
        studentsService.save(student);
        System.out.println(student);
    }
}
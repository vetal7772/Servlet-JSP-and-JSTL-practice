package com.javarush.servletdemo.model;


import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private long id;

    private String firstName;

    private String secondName;

    private String email;

    public static final Gson gson = new Gson();

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}

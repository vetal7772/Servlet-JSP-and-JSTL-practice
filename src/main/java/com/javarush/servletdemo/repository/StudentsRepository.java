package com.javarush.servletdemo.repository;

import com.javarush.servletdemo.model.Student;

import java.util.*;

public class StudentsRepository {

    private static  StudentsRepository instance;

    public static StudentsRepository getInstance(){
        if (instance == null){
            instance = new StudentsRepository();
        }
        return instance;
    }

   private HashMap<Long, Student> students = new HashMap<>(){{
       put(1L,Student.builder().id(1L).firstName("John").secondName("Brown").email("test1@gmail.com").build());
       put(2L,Student.builder().id(2L).firstName("Eva").secondName("Smith").email("test2@gmail.com").build());
       put( 3L,Student.builder().id(3L).firstName("Stevie").secondName("Wonder").email("test3@gmail.com").build());
   }};

//           Map.of(
//            1L,Student.builder().id(1L).firstName("John").secondName("Brown").email("test1@gmail.com").build(),
//            2L,Student.builder().id(2L).firstName("Eva").secondName("Smith").email("test2@gmail.com").build(),
//            3L,Student.builder().id(3L).firstName("Stevie").secondName("Wonder").email("test3@gmail.com").build());

public Optional<Student> getById(long id){
    return Optional.ofNullable(students.get(id));
    }

    public List<Student> findAll(){
    return new ArrayList<>(students.values());
    }

    public void save(Student student){
    students.put(student.getId(), student);
    }

    public void remove(long id){
    students.remove(id);
    }

    // Можна не використовувати цей метод, оскільки при необхідності змінити,
    // ми викличемо getStudentById, а потім save
//    public void updateStudent(Student student){
//    students.put(student.getId(), student);
//    }

    public boolean isPresent(long id){
    return students.containsKey(id);
    }

    public boolean isPresent(Student student){
        return students.containsKey(student.getId());
    }

}

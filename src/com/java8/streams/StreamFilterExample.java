package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {


    public static void main(String[] args) {

    filterStudents().forEach(System.out::println);
    }


    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents()
                .stream().filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }



}

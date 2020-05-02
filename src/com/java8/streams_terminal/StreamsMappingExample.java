package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

    public static void main(String[] args) {


        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));

        System.out.println("namesList : " + namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
        System.out.println("namesSet : " + namesSet);

    }
}

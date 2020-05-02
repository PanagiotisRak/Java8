package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static void main(String[] args) {
        System.out.println("Sorted By Name");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Sorted By Gpa");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Sorted By Gpa Reversed");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }

    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents()
        .stream().sorted(Comparator.comparing(Student::getName))
        .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream().sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream().sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
}

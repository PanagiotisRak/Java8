package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        Predicate<Student> studentFilter = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentFilter1 = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(studentFilter)
                .peek(student -> {
                    System.out.println("After first filter :" + student);
                })
                .filter(studentFilter1)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}

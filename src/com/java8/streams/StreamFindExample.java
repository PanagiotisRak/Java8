package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamFindExample {

    public static void main(String[] args) {

        Optional<Student> optionalStudent = findAny();
        if (optionalStudent.isPresent())
            System.out.println("Found student :" + optionalStudent.get());
        else
            System.out.println("Student Not found");

        Optional<Student> optionalStudent1 = findFirst();
        if (optionalStudent1.isPresent())
            System.out.println("Found student :" + optionalStudent1.get());
        else
            System.out.println("Student Not found");
    }

    public static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 4.9)
                .findFirst();
    }
}

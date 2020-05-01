package com.java8.methodReference;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    //ClassName :: methodName
    static Consumer<Student> c1 = System.out::println;

    //ClassName :: instanceMethodName
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}

package com.company.methodReference;

import com.company.data.Student;
import com.company.data.StudentDataBase;

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

package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    //takes an input returns nothing
    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Consumer<Student> c1 = (student -> System.out.println(student.getName()));
    static Consumer<Student> c2 = (student -> System.out.println(student.getActivities()));

    public static void main(String[] args) {

        printName();
        printNameAndActivities();
        printNameAndActivitiesWithConditions();
    }


    public static void printName() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivities() {
        System.out.println("Inside printNameAndActivities ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1.andThen(c2));

    }

    public static void printNameAndActivitiesWithConditions() {
        System.out.println("Inside printNameAndActivitiesWithConditions ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel()>=3)
               c1.andThen(c2).accept(student);
        });

    }
}
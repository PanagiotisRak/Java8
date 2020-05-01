package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p1 = student -> student.getGpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activites) -> {
        System.out.println("Student Name : " + name + " Activities : " + activites);
    };

    Consumer<Student> studentConsumer = (student -> {
        System.out.println("USING PREDICATE");
        if (p.and(p1).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
        // using bi predicate
        System.out.println("USING BI PREDICATE");
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }

    });


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);


    }

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }
}

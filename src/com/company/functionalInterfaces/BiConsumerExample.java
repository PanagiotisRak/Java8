package com.company.functionalInterfaces;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addition = (a,b) ->{System.out.println("Total is : " + (a + b) );};
        BiConsumer<Integer,Integer> multiply = (a,b) ->{System.out.println("Multiplication is : " + (a * b) );};
        addition.andThen(multiply).accept(3 ,5);


        nameAndActivities();
    }

    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String,List<String>> biConsumer = (name,activities) ->{
            System.out.println("Name is : " + name + " Activities are : " + activities);
        };

        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }
}

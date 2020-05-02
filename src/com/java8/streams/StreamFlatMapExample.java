package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {



    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getActivitiesCount());
    }


    public static List<String> printStudentActivities(){
        return  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream of List<String>
                .flatMap(List::stream) // Stream of String
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static long getActivitiesCount(){
        return  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream of List<String>
                .flatMap(List::stream) // Stream of String
                .distinct()
                .count();
        }


}

package com.company.functionalInterfaces;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    //takes no input retuns something
    static Supplier<Student> studentSupplier = () -> new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics"));


    public static void main(String[] args) {
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println(studentSupplier.get());
        System.out.println(listSupplier.get());
    }
}
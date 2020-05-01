package com.java8.methodReference;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThan;

    public static boolean greaterThan(Student student){
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}

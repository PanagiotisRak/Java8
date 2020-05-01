package com.company.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String ,String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String ,String> toUpperMethodReference = String::toUpperCase;



    public static void main(String[] args) {
        System.out.println(toUpperMethodReference.apply("java 8"));
    }
}

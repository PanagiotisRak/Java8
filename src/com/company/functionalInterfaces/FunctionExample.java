package com.company.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

   static Function<String,String> function = (s -> s.toUpperCase());
   static Function<String,String> concatString = (s -> s.toUpperCase().concat(" is awesome"));


    public static void main(String[] args) {

        System.out.println("Output is : "+ function.apply("java 8"));
        System.out.println("Output is : "+ function.andThen(concatString).apply("java 8"));
        System.out.println("Output is : "+ function.compose(concatString).apply("java 8"));

    }
}

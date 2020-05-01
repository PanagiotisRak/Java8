package com.java8.functionalInterfaces;

public class FunctionExample1 {

    public static void main(String[] args) {
        String result = performConcat("concat");
        System.out.println(result);
    }

    public static String performConcat(String string) {

        return FunctionExample.concatString.apply(string);

    }
}

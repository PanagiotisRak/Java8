package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,6,7);

        System.out.println(sumOfNumbers(integerList));
        System.out.println("Closed range Sum : " +sumOfNumbersIntStream());
        System.out.println("Ranged Sum : " +sumOfNumbersIntStreamRange());

        System.out.println("======================================");

        System.out.println("Max is : "+IntStream.rangeClosed(1,6).max());
        System.out.println("Min is : " +IntStream.rangeClosed(1,6).min());
        System.out.println("Average is : " +IntStream.rangeClosed(1,6).average());

    }

    public static int sumOfNumbers( List<Integer> integerList){
        return  integerList.stream().reduce(0,(x,y)-> x+y);
    }

    public static int  sumOfNumbersIntStream(){
       return IntStream.rangeClosed(1,6).sum();
    }

    public static int  sumOfNumbersIntStreamRange(){
        return IntStream.range(1,6).sum();
    }
}

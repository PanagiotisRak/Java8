package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {



    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,8);
        System.out.println(multiply(integerList));
        Optional<Integer> a = optionalMultiply(integerList);
        if(a.isPresent())
            System.out.println(a);
    }

    public  static  int multiply(List<Integer> integerlist){
      return   integerlist.stream().reduce(1,(a,b)-> a*b);
    }

    public  static Optional<Integer> optionalMultiply(List<Integer> integerlist){
        return   integerlist.stream().reduce((a,b)-> a*b);
    }

}

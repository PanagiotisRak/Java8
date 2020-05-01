package com.company.lambdas;


import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> integerComparator = (Integer a , Integer b) -> a.compareTo(b);
        Comparator<Integer> integerComparatorNoParameters = ( a ,  b) -> a.compareTo(b);
        Comparator<Integer> integerComparatorMethodReference = Integer::compareTo;

        System.out.println("integerComparator " + integerComparator.compare(3,4));
        System.out.println("integerComparatorNoParameters " + integerComparatorMethodReference.compare(4,4));
        System.out.println("integerComparatorMethodReference " + integerComparatorNoParameters.compare(6,5));
    }
}

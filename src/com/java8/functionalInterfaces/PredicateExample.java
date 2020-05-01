package com.java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample  {

   static Predicate<Integer> p = (a) -> a % 2 == 0;
   static Predicate<Integer> p1 = (a) -> a % 5 == 0;

    public static void main(String[] args) {
        predicateAnd();
        System.out.println("==========================");
        predicateOr();
        System.out.println("==========================");
        predicateNegate();
    }

    public static void predicateAnd(){
        System.out.println("Predicate and Result " + p.and(p1).test(10));
        System.out.println("Predicate and Result " + p.and(p1).test(9));
    }

    public static void predicateOr(){
        System.out.println("Predicate or Result " + p.or(p1).test(10));
        System.out.println("Predicate or Result " + p.or(p1).test(9));
        System.out.println("Predicate or Result " + p.or(p1).test(8));
    }

    public static void predicateNegate(){
        System.out.println("Predicate negate Result " + p.or(p1).negate().test(10));
        System.out.println("Predicate negate Result " + p.or(p1).negate().test(9));
        System.out.println("Predicate negate Result " + p.or(p1).negate().test(8));
    }
}

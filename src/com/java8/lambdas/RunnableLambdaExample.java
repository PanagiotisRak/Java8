package com.java8.lambdas;

public class RunnableLambdaExample  {

    public static void main(String[] args) {

        Runnable runnable = () ->  System.out.println("Runnable lambda");
        new Thread(runnable).start();
        new Thread(() ->  System.out.println("Runnable lambda 1")).start();

        Runnable runnable1 = () -> {
            System.out.println("Runnable lambda 2");
            System.out.println("Runnable lambda 2.1");
        };

        new Thread(runnable1).start();
    }
}

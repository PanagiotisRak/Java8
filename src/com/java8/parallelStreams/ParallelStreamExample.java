package com.java8.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential parallel Stream : " +checkPerformance(ParallelStreamExample::sumSequential,20));
        System.out.println("Parallel Stream : " +checkPerformance(ParallelStreamExample::sumParallel,20));
    }

    public static int sumSequential(){
        return IntStream.rangeClosed(1,10000).sum();
    }

    public static int sumParallel(){
        return IntStream.rangeClosed(1,10000).parallel().sum();
    }

    public static long checkPerformance(Supplier<Integer> supplier,int numberOfTimes){

        long startTime =System.currentTimeMillis();

        for (int i = 0 ; i< numberOfTimes; i++){
                   supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime ;
    }
}

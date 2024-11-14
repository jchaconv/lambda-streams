package com.jcacv.functional_programming.sec03streamapi.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec18Stream {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        //check for even numbers
        //interested in only three numbers
        // find the square
        // print it on the console

        numbers.stream()
                .filter(n -> {
                    System.out.println("filter-received :: " + n);
                    return n % 2 == 0;
                })
                .limit(3)
                .map(n -> {
                    System.out.println("map-received :: " + n);
                    return n * n;
                })
                .forEach(System.out::println);


    }


}

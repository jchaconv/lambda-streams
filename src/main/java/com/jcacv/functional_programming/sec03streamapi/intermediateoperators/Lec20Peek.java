package com.jcacv.functional_programming.sec03streamapi.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec20Peek {

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

        numbers.stream()
                .peek(n -> System.out.println("filter-received :: " + n))
                .filter(n -> n % 2 == 0)
                .limit(3)
                .peek(n -> System.out.println("map-received :: " + n))
                .map(n -> n * n)
                .forEach(System.out::println);


    }

}

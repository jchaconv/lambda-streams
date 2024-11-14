package com.jcacv.functional_programming.sec03streamapi.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec22MoreFilterAndMap {

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
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        numbers.stream()
                .peek(n -> System.out.println("filter-received :: " + n))
                .filter(n -> n > 5)
                .filter(n -> n % 2 == 0)
                .limit(4)
                .peek(n -> System.out.println("map-received :: " + n))
                .map(n -> n * n)
                .map(n -> n + 2)
                .forEach(System.out::println);


    }

}

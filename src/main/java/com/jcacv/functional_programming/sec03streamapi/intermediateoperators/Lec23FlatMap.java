package com.jcacv.functional_programming.sec03streamapi.intermediateoperators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lec23FlatMap {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);

        List<Integer> thirdList = new ArrayList<>();
        thirdList.add(7);
        thirdList.add(8);
        thirdList.add(9);

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(firstList);
        finalList.add(secondList);
        finalList.add(thirdList);

        //mostrando toda la tabla
        finalList.forEach(System.out::println);

        System.out.println("=====================");

        //mostrando uno por uno todos los valores
        //En lugar de Collection::stream puede ser (l -> l.stream())
        finalList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("=====================");

        //mostrando el cuadrado de cada número
        finalList.stream()
                .flatMap(Collection::stream)
                .map(n -> n * n)
                .forEach(System.out::println);

    }


}

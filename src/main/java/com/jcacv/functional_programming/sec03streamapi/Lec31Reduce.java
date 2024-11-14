package com.jcacv.functional_programming.sec03streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Lec31Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        //El hacerlo así no es el enfoque correcto para cantidades grandes de números
        //por las conversiones que se están haciendo de Objeto a primitivo y viceversa
        Optional<Integer> reduce = numbers.stream()
                .reduce((a, b) -> a + b);

        System.out.println(reduce.get());

        //El enfoque correcto sería tomar el stream y convertirlo a IntStream y usar un método sum()

        int sum = numbers.stream()
                .mapToInt(a -> a)
                //.boxed() Si quiero volver a tener un Stream<Integer>
                .sum();
        System.out.println(sum);

        System.out.println("=======================\n");

        IntStream.range(1, 10)
                .forEach(i -> System.out.println("Hello world :: " + i));

        System.out.println("=======================\n");

        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.println("Hello world :: " + i));

    }


}

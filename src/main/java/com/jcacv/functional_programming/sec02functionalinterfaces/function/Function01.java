package com.jcacv.functional_programming.sec02functionalinterfaces.function;

import java.util.function.Function;

public class Function01 {

    public static void main(String[] args) {

        Function<String, Integer> stringLength = String::length;

        Function<Integer, Integer> square = i -> i * i;

        System.out.println(
                stringLength.andThen(square).apply("practicing speaking skills with" +
                        "Connor's youtube channel")
        );

        System.out.println("***********************************");

        Function<Integer, Integer> plusTwo = i -> i + 2;

        System.out.println(
                //10              //100
                plusTwo.andThen(square).apply(8)
        );

        System.out.println(
                //66             //64
                plusTwo.compose(square).apply(8)
        );


    }


}

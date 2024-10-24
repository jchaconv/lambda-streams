package com.jcacv.functional_programming.sec02functionalinterfaces.predicate;

import java.util.function.Predicate;

public class Predicate01 {

    public static void main(String[] args) {

        Predicate<Integer> greaterThanTwo = n -> n > 2;
        Predicate<Integer> lessThanTen = n -> n < 10;

        //test
        System.out.println(
                greaterThanTwo.test(5)
        );

        //and
        System.out.println(
                greaterThanTwo.and(lessThanTen).test(4)
        );

        //or
        System.out.println(
                greaterThanTwo.or(lessThanTen).test(11)
        );

        //negate: to validate a condition won't happen
        System.out.println(
                lessThanTen.negate().test(44)
        );


    }


}

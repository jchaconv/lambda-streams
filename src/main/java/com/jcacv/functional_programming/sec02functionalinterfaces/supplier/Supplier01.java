package com.jcacv.functional_programming.sec02functionalinterfaces.supplier;

import java.util.function.Supplier;

public class Supplier01 {

    public static void main(String[] args) {

        Supplier<Double> randomDecimal = () -> Math.random(); //it's just a declaration
        System.out.println(randomDecimal.get());    //here is the execution with get()

        //With method reference
        Supplier<Double> randomDecimal2 = Math::random;
        System.out.println(randomDecimal2.get());


    }


}

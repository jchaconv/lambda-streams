package com.jcacv.functional_programming.sec02functionalinterfaces.callable;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Callable01 {

    public static void main(String[] args) throws Exception {

        Supplier<Double> supplier = Math::random;
        Callable<Double> callable = Math::random;

        System.out.println(
                supplier.get()
        );

        System.out.println(
                //requires to add exception to the method signature
                callable.call()
        );

    }




}

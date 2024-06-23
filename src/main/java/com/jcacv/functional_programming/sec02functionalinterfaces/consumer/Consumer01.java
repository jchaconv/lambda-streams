package com.jcacv.functional_programming.sec02functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer01 {

    public static void main(String[] args) {

        //EL ejemplo más sencillo, como se ve solo ejecuta algo y no tiene un valor de retorno
        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("Julio");

        System.out.println("==========");

        List<String> names = new ArrayList<>();
        names.add("Aaron");
        names.add("Cesar");
        names.add("Rut");

        //forEach acepta un Consumer
        names.forEach(c1);

        System.out.println("==========");

        names.forEach(s -> System.out.println(s.toUpperCase()));

    }

}

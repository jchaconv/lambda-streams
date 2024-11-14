package com.jcacv.functional_programming.sec03streamapi.finaloperators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lec26MinAndMax {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("César");
        names.add("Aarón");
        names.add("Rut");
        names.add("Elizabet");


        Optional<String> optionalString = names.stream()
                .filter(name -> name.contains("r"))
                .min(Comparator.reverseOrder());

        optionalString.ifPresent(s -> System.out.println(optionalString.get()));

        System.out.println("======================");

        Optional<String> optionalString2 = names.stream()
                .filter(name -> name.contains("r"))
                .max(Comparator.naturalOrder());

        optionalString2.ifPresent(s -> System.out.println(optionalString2.get()));


    }
}

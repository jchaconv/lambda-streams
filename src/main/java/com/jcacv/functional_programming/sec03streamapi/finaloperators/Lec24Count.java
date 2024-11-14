package com.jcacv.functional_programming.sec03streamapi.finaloperators;

import java.util.ArrayList;
import java.util.List;

public class Lec24Count {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("César");
        names.add("Aarón");
        names.add("Rut");
        names.add("Elizabet");

        System.out.println(
                names.stream()
                        .filter(name -> name.contains("a"))
                        .count()
        );


    }

}

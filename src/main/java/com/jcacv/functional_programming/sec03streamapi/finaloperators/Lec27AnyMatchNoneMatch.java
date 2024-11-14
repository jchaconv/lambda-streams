package com.jcacv.functional_programming.sec03streamapi.finaloperators;

import java.util.ArrayList;
import java.util.List;

public class Lec27AnyMatchNoneMatch {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("César");
        names.add("Aarón");
        names.add("Rut");
        names.add("Elizabet");

        System.out.println(
                names.stream()
                        .filter(name -> name.length() > 3)
                        .anyMatch(name -> name.contains("ar"))
        );

        System.out.println("================");

        System.out.println(
                names.stream()
                        .filter(name -> name.length() < 6)
                        .noneMatch(name -> name.contains("ab"))
        );


    }

}

package com.jcacv.functional_programming.sec03streamapi.finaloperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lec25FindFirstAndOptional {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("César");
        names.add("Aarón");
        names.add("Rut");
        names.add("Elizabet");

        //Optional.empty porque no existe data con la validación
        System.out.println(
                names.stream()
                        .filter(name -> name.length() > 50)
                        .findFirst()
        );

        System.out.println("=====================");

        Optional<String> optionalString = names.stream()
                .filter(name -> name.contains("e"))
                .findFirst();// -> Optional[Elizabet]

        //should be replaced with method references
        if(optionalString.isPresent()) {
            System.out.println(optionalString.get());
        }

    }
}

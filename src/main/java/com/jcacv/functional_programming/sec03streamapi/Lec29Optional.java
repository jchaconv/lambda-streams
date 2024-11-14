package com.jcacv.functional_programming.sec03streamapi;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Lec29Optional {

    public static void main(String[] args) {

        String a = "ball";
        String b = "delta";
        String c = "apple";

        Optional<String> smallest = getSmallest(a, b, c);

        if(smallest.isPresent())
            System.out.println(smallest.get().toUpperCase());
        else
            System.out.println("No value found");

    }

    private static Optional<String> getSmallest(String var1, String var2, String var3) {

        //return Optional.ofNullable(null);
        return Stream.of(var1, var2, var3)
                .min(Comparator.naturalOrder());
    }


}

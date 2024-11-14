package com.jcacv.functional_programming.sec03streamapi.finaloperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Lec28Collect {

    public static void main(String[] args) {

        List<String> heroes = new ArrayList<>();
        heroes.add("Batman");
        heroes.add("Superman");
        heroes.add("Aquaman");
        heroes.add("Flash");
        heroes.add("Cru");
        heroes.add("Robin");
        heroes.add("BeastGuy");
        heroes.add("Batman");

        List<String> newHeroList = heroes.stream()
                .filter(hero -> hero.length() > 3)
                .collect(Collectors.toList());

        System.out.println("Original list :: " + heroes);

        System.out.println("================");

        System.out.println("New list :: " + newHeroList);

        System.out.println("================");

        Set<String> collectHeroesSet = heroes.stream()
                .filter(hero -> hero.length() > 3)
                .collect(Collectors.toSet());

        System.out.println("Set :: " + collectHeroesSet);

        System.out.println("================");

        String joinedString = heroes.stream()
                .filter(hero -> hero.length() > 3)
                .collect(Collectors.joining());

        System.out.println(joinedString);

        String joinedDelimiterString = heroes.stream()
                .filter(hero -> hero.length() > 3)
                .collect(Collectors.joining("|"));

        System.out.println(joinedDelimiterString);

        System.out.println("================");

        Map<Integer, List<String>> collectGroupingByLength = heroes.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collectGroupingByLength);
        System.out.println(collectGroupingByLength.get(8));

        //no ordena alfabéticamente
        Map<Character, List<String>> collectGroupingByFirstCharacter = heroes.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(collectGroupingByFirstCharacter);

    }


}

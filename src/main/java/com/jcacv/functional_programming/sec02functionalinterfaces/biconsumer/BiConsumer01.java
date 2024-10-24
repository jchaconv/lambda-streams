package com.jcacv.functional_programming.sec02functionalinterfaces.biconsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumer01 {

    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("C#");

        Consumer<String> dbConsumer = (s) -> System.out.println("Writing into DB :: " + s);
        Consumer<String> loggingConsumer = (s) -> System.out.println("Writing into log file :: " + s);

        Consumer<String> dbLoggingConsumer = dbConsumer.andThen(loggingConsumer);

        //Uso de BiConsumer
        BiConsumer<String, Integer> biConsumer = (s, i) -> {
            System.out.println(i + " :: My favorite programming language is :: " + s);
        };

        for (int i = 0; i < programmingLanguages.size(); i++) {
            biConsumer.accept(programmingLanguages.get(i), i);
        }

        System.out.println("============================");

        Map<String, Consumer<String>> consumerMap = new HashMap<>();
        consumerMap.put("database", dbConsumer);
        consumerMap.put("logger", loggingConsumer);
        consumerMap.put("dbLogging", dbLoggingConsumer);

        consumerMap.forEach((k, v) -> {
            System.out.println("key is :: " + k);
        });


    }


}

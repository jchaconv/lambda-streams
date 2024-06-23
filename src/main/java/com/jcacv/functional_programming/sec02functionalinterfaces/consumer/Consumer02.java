package com.jcacv.functional_programming.sec02functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Consumer02 {

    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Aaron");
        programmingLanguages.add("Cesar");
        programmingLanguages.add("Rut");

        Consumer<String> dbConsumer = (s) -> System.out.println("Writing into DB :: " + s);
        Consumer<String> loggingConsumer = (s) -> System.out.println("Writing into log file :: " + s);

        //Este consumer junta la lógica de los dos anteriores
        Consumer<String> dbLoggingConsumer = dbConsumer.andThen(loggingConsumer);

        //En el forEach le paso el nuevo consumer
        programmingLanguages.forEach(dbLoggingConsumer);

        System.out.println("============================");

        //También podemos usar Map
        Map<String, Consumer<String>> consumerMap = new HashMap<>();
        consumerMap.put("database", dbConsumer);
        consumerMap.put("logger", loggingConsumer);
        consumerMap.put("dbLogging", dbLoggingConsumer);

        programmingLanguages.forEach(consumerMap.get("dbLogging"));


    }


}

package com.jcacv.functional_programming.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestMain2 {

    public static void main(String[] args) {

        GreetingService2 g1 = (n) -> {
            return n.toUpperCase();
        };

        //another way
        GreetingService2 g2 = (n) -> n.toUpperCase();

        System.out.println(g2.greet("julio"));

        // ####################################################
        // share state and side effect
        System.out.println("##################################");

        List<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("Cesar");
        names.add("Aaron");

        GreetingService2 g3 = (n) -> {
            //esto representa un share state porque depende de objetos fuera de la función
            return n.toUpperCase() + " " + names.get(1);
        };

        System.out.println(g3.greet("Julio"));

        GreetingService2 g4 = (n) -> {
            //esto representa un side effect porque puede funcionar la primera vez pero si otro hilo ejecuta lo mismo
            //va a retornar un IndexOutboundException porque no va a encontrar el indice 1
            names.remove(1);
            return n.toUpperCase();
        };

        System.out.println(g4.greet("Julio"));

    }



}

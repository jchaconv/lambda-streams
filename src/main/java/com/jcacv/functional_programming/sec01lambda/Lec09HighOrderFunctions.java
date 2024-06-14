package com.jcacv.functional_programming.sec01lambda;

public class Lec09HighOrderFunctions {

    public static void main(String[] args) {
        String text = getLambda().greet("i'm back");
        System.out.println(text);
    }

    //Aquí el método retorna una función lambda
    private static GreetingService2 getLambda() {
        GreetingService2 g = (s) -> s.toUpperCase();
        return g;
    }



}

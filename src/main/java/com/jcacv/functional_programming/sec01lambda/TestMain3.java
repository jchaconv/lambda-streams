package com.jcacv.functional_programming.sec01lambda;

public class TestMain3 {

    public static void main(String[] args) {

        System.out.println("== Starting execution ==");

        //En POO se ejecuta primero getNumber y luego receiveNumber
        //receiveNumber(getNumber());

        //Lambda
        test(s -> {
            //Este bloque de código no es un executable code sino el comportamiento que estamos pasando
            System.out.println("Inside lambda function");
            return s.toUpperCase();
        });

        System.out.println("== Ending execution ==");
    }

    private static int getNumber() {
        System.out.println("Called getNumber");
        return 10;
    }

    private static void receiveNumber(int i) {
        System.out.println("Received number is :: " + i);
    }

    private static void test(GreetingService2 g) {
        System.out.println("Inside test method. Received greeting service");
        String returnedString = g.greet("aaron");
        System.out.println(returnedString);
    }


}

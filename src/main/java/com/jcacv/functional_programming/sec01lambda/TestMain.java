package com.jcacv.functional_programming.sec01lambda;

public class TestMain {

    public static void main(String[] args) {

        GreetingService hiService = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hi " + name);
            }
        };

        hiService.greet("Julio Chacon");

        GreetingService helloService = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        helloService.greet("Rut Ludeña");

        //My first lambda
        GreetingService greetingService = (String name) -> {
            System.out.println("Hello ... " + name);
        };

        greetingService.greet("Ari Ludeña");

        //Another ways to implement a lambda function (only one line)

        // #1
        GreetingService greetingService1 = (String name) -> System.out.println("Hi ..." + name);
        greetingService1.greet("Nayeli Diaz");

        //#2 Without the type of parameter
        GreetingService greetingService2 = (name) -> System.out.println("HELLO ..." + name);
        greetingService2.greet("Carolin Vilela");


        //#################################################
        //Multi line lambda
        GreetingService greetingService3 = (name) -> {
            System.out.println("###################");
            System.out.println("multi line");
        };

        greetingService3.greet("César Chacón");

    }


}

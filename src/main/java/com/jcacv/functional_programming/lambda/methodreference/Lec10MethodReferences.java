package com.jcacv.functional_programming.lambda.methodreference;

import java.util.Objects;

public class Lec10MethodReferences {

    public static void main(String[] args) {

        //Method reference
        //StringOperations op1 = System.out::println; ---> funciona cuando accept() es void
        //op1.accept("baby don't hurt me");

        //StringOperations op2 = (s) -> s.toUpperCase();
        StringOperations op2 = String::toUpperCase;
        System.out.println(op2.accept("julio chacon"));


        //BooleanOperations op2 = (s) -> Objects.isNull(s);
        BooleanOperations op3 = Objects::isNull;
        System.out.println(op3.accept(null));
        System.out.println(op3.accept("50 cent"));


    }



}

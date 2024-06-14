package com.jcacv.functional_programming.sec01lambda.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lec10MethodReferences {

    private static final List<String> names = new ArrayList<>();

    public static void main(String[] args) {

        //Method reference
        //StringOperations op1 = System.out::println; ---> funciona cuando accept() es void
        //op1.accept("baby don't hurt me");

        //StringOperations op2 = (s) -> s.toUpperCase();
        StringOperations op2 = String::toUpperCase;
        System.out.println(op2.accept("julio chacon"));

        //StringOperations2 op4 = (s1, s2) -> s1.concat(s2);
        StringOperations2 op4 = String::concat;
        System.out.println(op4.accept("this is text1", " and text 2"));

        //BooleanOperations op2 = (s) -> Objects.isNull(s);
        BooleanOperations op3 = Objects::isNull;
        System.out.println(op3.accept(null));
        System.out.println(op3.accept("50 cent"));

        //Part4
        //VoidOperations op5 = (s) -> names.add(s);
        VoidOperations op5 = names::add; //no es pure function
        op5.accept("Julio");
        op5.accept("Cesar");
        op5.accept("Aaron");

        System.out.println(names);

    }



}

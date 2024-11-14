package com.jcacv.functional_programming.sec03streamapi.compare;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestMain {

    public static void main(String[] args) {

        Student a = new Student("Julio", 80, 150);
        Student b = new Student("Rut", 120, 110);
        Student c = new Student("Cesar", 50, 123);
        Student d = new Student("Nayeli", 99, 90);

        Optional<Student> op = Stream.of(a, b, c, d)
                .min(Comparator.comparing(Student::getName));

        System.out.println(op.get());

        Optional<Student> op1 = Stream.of(a, b, c, d)
                .max(Comparator.comparing(Student::getScore));

        System.out.println(op1.get());


    }


}

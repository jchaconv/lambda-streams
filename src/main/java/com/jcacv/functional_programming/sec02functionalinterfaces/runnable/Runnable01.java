package com.jcacv.functional_programming.sec02functionalinterfaces.runnable;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

public class Runnable01 {

    public static void main(String[] args) {

        //lambda expression
        Runnable runnable = () -> {

            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Testing runnable interface");

        };

        //async non-blocking process
        new Thread(runnable).start();

        //this is going to be executed first
        System.out.println("Are you ok kid?");


    }


}

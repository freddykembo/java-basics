package com.javabasics;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Non-primitive data types AKA Reference types
        String name = new String("freddykembo");
        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());
    }
}
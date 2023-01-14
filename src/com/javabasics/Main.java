package com.javabasics;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Difference between Primitive and Reference types
        int a = 10;
        int b = a; // Copied a value to a different memory address
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        // Pointing to the same reference
        Person fred = new Person("Fred");
        Person kembo = fred;

        System.out.println("Before changing fred");
        System.out.println(fred.name + " " + kembo.name);

        fred.name = "Freddy";

        System.out.println("After changing fred");
        System.out.println(fred.name + " " + kembo.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
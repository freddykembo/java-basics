package com.javabasics;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // String
        String name = "freddykembo";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));

        String secondName = "kembo";
        System.out.println(name.contains(secondName));
        System.out.println(name.equals(secondName));
    }
}
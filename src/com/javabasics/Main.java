package com.javabasics;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // For loop
        int [] numbers = {0, 1, 2, 3, 100};
        String [] names = {"freddy", "kembo", "jayden", "jelani", "jari"};

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Enhanced for loop");

        for (int number : numbers) {
            // No access to index
            System.out.println(number);
        }

        System.out.println("---------------------------------------------------");
        
        Arrays.stream(names).forEach(System.out::println);

    }
}
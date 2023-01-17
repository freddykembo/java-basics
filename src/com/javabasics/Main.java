package com.javabasics;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Arrays

//        int [] numbers = new int[3];
//        numbers[0] = 2;
//        numbers[1] = 1;
//        numbers[2] = 0;

        int [] numbers = {0, 1, 2, 3}; // No size of array defined. Open to add
        String [] names = {"freddy", "kembo"};

        int one = numbers[1];
        String lastName = names[names.length - 1];

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
        System.out.println(one);
        System.out.println(lastName);
    }
}
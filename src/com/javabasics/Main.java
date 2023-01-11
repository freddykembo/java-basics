package com.javabasics;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Size 1 byte. Stores whole numbers from -128 to 127
        byte theByte = -128;

        // Size 2 bytes. Stores whole numbers from -32,768 to 32,767
        short theShort = -32_768;

        // Size 4 bytes. Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int theInt = 2_147_483_647;

        // Size 8 bytes. Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long theLong = 9_223_372_036_854_775_807L;

        // Size 4 bytes. Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float pi = 3.14F;

        // Size 8 bytes. Stores fractional numbers. Sufficient for storing 15 decimal digits
        double doublePi = 3.1415;

        // Size 1 bit. Stores true or false values
        boolean isAdult = true;

        // Size 2 bytes. Stores a single character/letter or ASCII values
        char nameInitial = 'F';

        System.out.println(theByte);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);

    }
}
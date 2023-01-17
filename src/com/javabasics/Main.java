package com.javabasics;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Switch statement
        String gender = "FEMALE";

        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a Female");
                break;
            case "MALE":
                System.out.println("I am a Male");
                break;
            case "PREFER NOT TO SAY":
                System.out.println("PREFER NOT TO SAY");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }
}
package com.javabasics;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Packages and import statement
        Date date = new Date();
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        java.sql.Date dateSql = new java.sql.Date(1);
    }
}
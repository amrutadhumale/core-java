package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fjc_101_DateTime_Formating {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();// this is date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy--E a"); //this is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);//creating date string using date and formate
        System.out.println(myDate);
    }
}

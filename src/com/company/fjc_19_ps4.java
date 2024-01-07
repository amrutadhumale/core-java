package com.company;
//import java.util.Scanner;
//public class fjc_19_ps4 {
  //  public static void main(String[] args) {
        //que2
     /*  byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in  physics");
        m1 = sc.nextByte();
        System.out.println("enter your marks in chemistry");
        m2=sc.nextByte();
        System.out.println("enter your name in maths");
        m3 =sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is:" + avg);
        if(avg>=40 && m1>=33&& m2 >=33 && m3>= 33){
            System.out.println("congratulations, you have been promoted");}
        else{
            System.out.println("sorry, you have not been promoted! please try again.");}*/

     /*  // que3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income =sc.nextFloat();
        if(income<2.5){
            tax = tax+0;}
        else if (income>2.5f&& income <=5f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);}
        else if (income > 5f && income <= 10f) {
                tax = tax + 0.05f * (5.0f - 2.5F);
                tax = tax + 0.2f * (income - 5f);
            } else if (income > 10.0f) {
                tax = tax + 0.05f* (5.0f - 2.5f);
                tax = tax + 0.2f * (10.0f - 5f);
                tax = tax + 0.3f * (income - 10.0f);
            }
            System.out.println("The total tax paid by the employee is:" +tax);*/

      //  que4
      /*   Scanner sc= new Scanner(System.in);
         int day = sc.nextInt();
         switch (day){
             case 1:
                 System.out.println("monday");
                 break;
             case 2:
                 System.out.println("tuesday");
                 break;
             case 3:
                 System.out.println("wednesday");
                 break;
             case 4:
                 System.out.println("thusday");
                 break;
             case 5:
                 System.out.println("friday");
                 break;
             case 6:
                 System.out.println("saturdy");
                 break;
             case 7 :
                 System.out.println("sunday");
                 break;*/

      //  que6
      /*  Scanner sc= new Scanner(System.in);
        String website = sc.next();
        if ( website.endsWith(".org")){
            System.out.println("th  is is an orgnizatinal website");}
        else if ( website.endsWith(".com")){
            System.out.println("this is aan commercial website");}
        else if (website.endsWith(".in")){
            System.out.println("this is a indian website");*/

    //  que5 find whether year is leap year or not

import java.util.Scanner;

        public class fjc_19_ps4 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                if (isLeapYear(year)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }

            public static boolean isLeapYear(int year) {
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            }
        }












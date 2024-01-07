package com.company;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class fjc_6_practice {
    public static void main(String[] args) {
      System.out.println("taking input from the user");
       Scanner sc= new Scanner(System.in);
        System.out.println("enter number1");
        int a = sc.nextInt();
        System.out.println("enter number2");
        int b= sc.nextInt();
        System.out.println("enter number 3");
        int c =sc.nextInt();
        System.out.println("enter number 4");
        int d =sc.nextInt();
        System.out.println("enter number 5");
        int e = sc.nextInt();

       float percentage = ((a+b+c+d+e)/ 500.0f)*100;
        System.out.println("percentage: ");
        System.out.println(percentage);



       /* float subject1= 40;
        float subject2 = 50;
        float subject3 = 75;
        float subject4 =90;
        float subject5 = 67;
        float per = (subject1 + subject2 + subject3+subject4 + subject5)/500*100;
        System.out.println(per);*/




    }
}

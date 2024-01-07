package com.company;

import java.util.Scanner;

public class fjc_18_elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age");
         Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        /* if (age>56){
             System.out.println("you are experienced!");}
         else if (age>46){
             System.out.println("you are semi-experienced");}
         else if (age>36){
             System.out.println("you are semi-semi-experienced");}
         else {
             System.out.println("you are not experienced");*/
        switch (age) {
            case 18:
                System.out.println("you are going to become an adult!");
                break;
            case 23:
                System.out.println("you are going to join a job!");
                break;
            case 60:
                System.out.println("you are going to retired!");
                break;
            default:
                System.out.println("enjoy your life!");

    /*  char var= 'e';
        switch (var) {
            case 'r':
                System.out.println("you are going to become an adult!");
                break;
            case 'e':
                System.out.println("you are going to join a job!");
                break;
            case 'u':
                System.out.println("you are going to retired!");
                break;
            default:
                System.out.println("enjoy your life!");}*/

                String var = "amruta";
                switch (var) {
                    case "amruta":
                        System.out.println("you are going to become an adult!");
                        break;
                    case "saurabh":
                        System.out.println("you are going to join a job!");
                        break;
                    case "sunny":
                        System.out.println("you are going to retired!");
                        break;
                    default:
                        System.out.println("enjoy your life!");


                }


        }
    }
}

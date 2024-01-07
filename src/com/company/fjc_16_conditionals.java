package com.company;
import java.util.Scanner;
public class fjc_16_conditionals {
    public static void main(String[] args) {
      /*  int age = 17;
        if (age>18){
            System.out.println("yes boy you can drive!");}
        else{
            System.out.println("no boy you cannot drive drive yet!");}*/

        //condion
      /*  int age = 19;
        boolean cond = (age==18);
        if (cond){
            System.out.println("yes boy you can drive!");}
        else {
            System.out.println("no boy you cannot drive yet!");
        }*/
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
            int marks = sc.nextInt();

            if (marks<= 50 ) {
                System.out.println("you are not qualified");
            } else if (marks > 50 && marks<= 100) {
                System.out.println("you are qualified");
            } else if (marks<=200) {
                System.out.println("you are qualified with outsanding grade");

            }


            }


        }








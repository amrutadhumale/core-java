package com.company;
import java.util.Scanner;
public class Reverse_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        //1234

        //1. using algorithum

       /* int rev = 0;
        while (num!= 0)
        {
            rev = rev*10 + num%10;   // 0+1234%10= 4;  40+3 ; 430+2 =432; 4320+1= 4321
            num = num/10; //1234/10= 123 ;  123/10=1;  12/10=1  1/10= 0

            System.out.println("Reverse number is :" + rev);
            */
        //usingstrinBuffer class

        /*StringBuffer sb= new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reverse Number is :" + rev);

         */

        String str="ABCD";
        String rev = null;

        /*int len=str.length(); //4
        for(int i = len)*/
        }

    }


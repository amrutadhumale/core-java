package com.company;

public class Recursion_by_apna_college {
    public static void printnum(int n){
       /* if(n == 0){
            return;*/
        if (n==6){
            return;
        }
       /* System.out.println(n);
        printnum(n-1);*/

        System.out.println(n);
        printnum(n+1);
    }
    public static void main(String[] args) {
       /* int n =5;
        printnum(n);*/

        int n = 1;
        printnum(n);

    }
}

package com.company;
import java.util.Scanner;

public class fjc_78_errorsdemo {
    public static void main(String[] args) {
        // logical error
        System.out.println(2);
        for(int i =1; i<5 ; i++){
            System.out.println(2*i+1);
        }
        //runtime error
        int k;
        Scanner sc = new Scanner(System.in);
       k =  sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is" + 1000/k);
    }
}

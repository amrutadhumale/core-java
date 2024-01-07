package com.company;
import java.util.Scanner;

public class Loops_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* int n = sc.nextInt();
        int num =1;
        int sum= 0;
        while (num<=n){
            sum=sum+num;
            num++;
            System.out.println(sum);*/

            //que 2

            /*int num = sc.nextInt();
            int sum = 0 ;
            while(num!= -1){
                sum+=num;
                num=sc.nextInt();
                System.out.println(sum);*/


                for(int num= 1; num<=50 ; num++){
                    if (num%3==0){
                        continue;
                    }
                    System.out.println(num);
            }


        }
    }


package com.company;
import java.util.Scanner;

public class fjc_86_ps_14 {
    public static void main(String[] args) {
        //que1
      //  int a = 7 //syntax error
       /* int age =78;
        int year_born = 2000-78;//logical error
        System.out.println(6/0);*/

        //que2
        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("hahaha");
        }catch(ArithmeticException e){
            System.out.println("hihihi");
            //que3

            boolean flag = true;
           int[] marks = new int [3];
           marks[0]= 7;
           marks [1]= 56;
           marks[2] = 6;
           Scanner sc  = new Scanner(System.in);
           int index;
           int i = 0;
           while(flag){
               index =sc.nextInt();
               System.out.println("The value of marks[index] is " + marks[index]);
               i++;
           }
            if(i>=5){
                System.out.println("Error");
        }

        }
    }
}

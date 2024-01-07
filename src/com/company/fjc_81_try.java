package com.company;
import java.util.Scanner;

public class fjc_81_try {
    public static void main(String[] args) {
        int[] marks =new int[3];
        marks[0] =7;
        marks[1]= 56;
        marks[2] = 6;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the arrey index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value of arrey index entered is :" + marks [ind]);
            System.out.println("The value of arrey-value/number is :" + marks[ind]/number);
        } catch(ArithmeticException e){
            System.out.println("some exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }catch(Exception e){
            System.out.println("some exception occured");
            System.out.println(e);
        }

    }




}

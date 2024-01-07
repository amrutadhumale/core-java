package com.company;
import java.util.*;


public class code_challenge {
    public static void main(String[] args) {
       /* System.out.println("Enter your Input");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I') {
            System.out.println("it's vowel");
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'z')
        {
            System.out.println("It's  is a consonent");

        }
        else{
            System.out.println("Invalid credential");
        }*/


      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Otput");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " Is an Alphabet");
        } else if (ch >= 1 && ch <= 100000) {
            System.out.println(ch + " Is Number");
        }else{
            System.out.println("Invalid Credential");
        }*/


      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int i = sc.nextInt();
        if ( i>=1){
            System.out.println("Number is Positive");

        }else{
            System.out.println("Numbe is negeative");
        }*/


     //   ascii value finding

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        char ch = sc.next().charAt(0);
        //int ascii_value = ch;

        int cast_Ascii = (int) ch;
        System.out.println("The ASCII Value of "+ ch+ "is: "+cast_Ascii);*/


        //leap year or not2024
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int yr = sc.nextInt();
        System.out.println("Enter Month");
        int mo = sc.nextInt();
        if (( (mo==2)&&( yr % 400==0))|| (( yr% 100 !=  0) &&( yr %4 == 0) )){
            System.out.println("Number of days is 29");
        }else if (mo ==2){
        System.out.println("Number of days is 28");
        }else if (mo ==1 || mo==3|| mo==5|| mo == 7|| mo==8|| mo==10||mo ==12){
            System.out.println("Number of days is 31");
        }else {
            System.out.println("Number of months is 30 ");
        }

    }
}
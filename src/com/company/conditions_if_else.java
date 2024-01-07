package com.company;
import java.util.Scanner;
public class conditions_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*   System.out.println("Enter a number");
        int n = sc.nextInt();
       // System.out.println(n*n);
        if(n%2==0){
            System.out.println("The number is Even");
        }
        if (n%2!=0) {
            System.out.println("The number is odd");
        }*/
        //leap year
       /* System.out.println("Enter Year");

        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("This is leap year");
        }else{
            System.out.println("This is not leap year");
        }*/

       // absolute value

     /*   System.out.println("Enter your value");
        int n=sc.nextInt();
        if(n<0){
            n=n*(-1);
        } System.out.println("Absolute value is :"+ n);
          */
       // profit-loss que

    /*   System.out.println("enter cost prise");
        int c = sc.nextInt();
        System.out.println("enter selling prise");
        int s = sc.nextInt();
        if(c>s){
            System.out.println("you are in loss");
            System.out.println("The amount of loss is:"+(c-s));
        }else{
            System.out.println("You have made profit");
            System.out.println("The amount of profit is:"+(s-c));
        }*/

        //rectangle problem
       /* System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breath");
        int b = sc.nextInt();
        if (l*b>2*(l+b)){
            System.out.println("Area of ractangle is grater than parimeter");
            System.out.println("The area is: "+(l*b));
        }else if(l*b==2*(l+b)){
            System.out.println("Length And Perimeter are same");
        }

        else{
            System.out.println("Perimeter of rectangle is greater than the area");
            System.out.println("The perimeter is: "+(2*(l+b)));


        }*/

        //find largest one
        System.out.println("enter your number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a>b&&a>c){
            System.out.println(a+": is greater");
        }else if(b>a&&b>c){
            System.out.println(b+": is greater");
        }
        else{
            System.out.println(c+": is greater");
        }
    }
}

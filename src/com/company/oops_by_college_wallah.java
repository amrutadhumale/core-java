package com.company;

import org.w3c.dom.ls.LSOutput;

public class oops_by_college_wallah {
    public static  class student{
        String name;
        int rno;
        double percent;
    }
    public static class car{
        String name;
        String type;
        int price;
    }
    public static void fun(student x){
        System.out.println(x.name);
        return;
    }
    public static void change (int x){
        x=7;
        return;
    }
    public static void change (student  s){
        s.name = "Rohan";
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "RAGHAV";

       /* student x = new student ();
        x.name = "Raghav";
        x.rno = 45;
        x.percent = 6;
        System.out.println(x.name);*/

       /* car c = new car ();
        c.name =" Honda";
        c.type = "for whiller";
        c.price = 30000;
        System.out.println(c.price+4000);*/


       // fun(x);

        //int x= 5;
      /*  System.out.println(x);
        change(x);
        System.out.println(x);*/

        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);


    }
}
package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;
import java.util.Calendar;

public class fjc_102_ps_15 {
    public static void main(String[] args) {
        //que1
        ArrayList
                ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        for (Object o : ar) {
            System.out.println(o);

            //ps5
            HashSet<Integer> s = new HashSet();
            s.add(5);
            s.add(6);
            s.add(45);
            s.add(81);
            s.add(9);
            //psq2

            Date d = new Date();
            System.out.println(d.getHours()+":" + d.getMinutes()+":" + d.getSeconds());

            Calendar c = Calendar.getInstance();
            System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":"+ c.get(Calendar.MINUTE)+":" +   c.get(Calendar.SECOND));



        }
    }
}
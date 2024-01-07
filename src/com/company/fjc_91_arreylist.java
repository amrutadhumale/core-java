package com.company;
import java.util.*;
public class fjc_91_arreylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(18);
        l2.add(35);
        l1.add(7);
        l1.add(4);
        l1.add(0,5);
        l1.add(0, 1);
        l1.add(4);
        l1.addAll(0, l2);
        l1.add( 7,34);
       // l1.clear();
        System.out.println(l1.contains(2));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(4));
        for(int i = 0; i<l1.size() ; i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}

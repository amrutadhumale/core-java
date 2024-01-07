package com.company;
import java.util.*;
public class fjc_92_linkedList {
    public static void main(String[] args) {
      LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
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


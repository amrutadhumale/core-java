package com.company;
import java.util.HashSet;

public class fjc_95_hashset {
    public static void main(String[] args) {
        HashSet<Integer>myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(65);
        myHashSet.add(21);
        myHashSet.add(34);
        System.out.println(myHashSet);

    }
}

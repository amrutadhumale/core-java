package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class creating_arrayList {
    public static class Arraylist {
        int[] arr = new int[2];
        int inx = 0;
        int size = 0;

        public void add(int ele) {
            if (size == arr.length) {

                int[]brr = Arrays.copyOf(arr,arr.length*2);
                arr=brr;
            }
            arr[inx] = ele;
            inx++;
            size++;
        }
    }
    public static void main(String[] args) {
        Arraylist arr =new Arraylist ();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
       // arr.add(5);
        System.out.println(arr.size);



    }
}

package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array_copy_concept {
    static void printArray (int[] arr){
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr =new int[5];
        arr[0] = 5 ;
        arr[1] = 4;
        arr[2]= 7;
        arr[3] =3;
        arr[4] = 9;
        System.out.println(" original array");
        printArray(arr);
        //coping aaray

        //int[]arr_2= Arrays.copyOf(arr, arr.length);
        int[]arr_2= Arrays.copyOf(arr, 2);
       // int []arr_2 = arr.clone();
        System.out.println("copied arr_2");
        printArray(arr_2);
        arr_2[0] =0;
        arr_2[1] = 0;
        System.out.println("the value of arr after change is " );
        System.out.println("The value of arr_2 after change is " );
        printArray(arr);
        printArray(arr_2);


    }

}

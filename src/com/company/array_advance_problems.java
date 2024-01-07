package com.company;
import java.util.Scanner;



public class array_advance_problems {

    static void printArray(int []arr){
        for(int i= 0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //taking input array input
        System.out.println("Enter size of Array");

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter"+ n+ " elements");
        for (int i = 0; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the main arrays ");
       printArray( arr);
        //Triying to copy arr to arr 2
        int[] arr_2 = new int[n];
      for(int i = 0; i <n; i++){
          arr_2[i] = arr[i];
        }
        System.out.println("the copied array");
      printArray(arr_2);


    }
}

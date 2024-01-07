package com.company;
import java.util.Scanner;
public class Artray_last_occurance {
    static int lastOccurance(int[]arr, int x){
        int lastindex = -1;
        for (int i = 1; i<arr.length; i++){
            if (arr[i]==x){
                lastindex= i;
            }
        }return lastindex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc. nextInt();
        int[] arr = new int[n];
        System.out.println("Enter"+n+"element");
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("The last occurance of x is : " + lastOccurance(arr, x));
    }
}

package com.company;

public class swaping_methods {
    static void swapArray(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[]arr){
        int i =0, j = arr.length-1;
        while(i<j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
      /*  int a = 10, b= 20;
        System.out.println("Before swapping value are."+a+" "+b);
        //Logic1 - Third variable
        int t = a;
        /*a=b;
        b=t;
        System.out.println("After swapping value are"+a+" "+b);
         */
        //logic 2
     /*   a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a is"+a+" "+"and the value of b is"+b);*/
      /* a=a*b;//10*20= 200
       b=a/b;//200/20=10
       a=a/b;//200/10
        System.out.println("the value of a is"+a+" "+"and the value of b is"+b);


     //logic 4 biwise XOR(^)
        a = a^b; // 10^22030 a =1010; b =10100
        b=a^b; //30^20 =10
        a = a^b; //30^10=20

        //logic 5
        b= a+b-(a=b);*/


        //REVERSE THE AARAY
      /*  int []arr = { 1, 2,3, 4, 5};
        for( int i = arr.length; i>=1;i--){
            System.out.print(i);
        }
        System.out.println();*/

        int []arr= { 1, 2, 3, 4, 5};
        reverseArray(arr);








    }
}

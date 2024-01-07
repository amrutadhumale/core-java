package com.company;
import java.util.Scanner;

public class pattern_printing {

    public static void main(String[] args) {

       /* for(int i = 0 ; i< 5 ; i++) {
            for(int k = 5 ; k >= i ; k-- ){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();*/


        //2 square
    /*    for(int i = 1; i<=3; i++){
            for(int j=1; j<=6;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //3 hollow rectangle
       /*System.out.println("Enter your number");
       Scanner sc= new Scanner(System.in);
       int r = sc.nextInt();
       int y = sc.nextInt();
       for(int i = 1; i <= r;i++){
           for(int j = 1; j<=y; j++){
               if( i==1||i==r||j==1||j==y)
                   System.out.print("*");
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }*/
        //4

      /* for(int i = 1; i<=4;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }*/
      /*  for(int i =1 ;i<=4;i++){
            for(int j= 1;j<=i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }*/


        //REVERSE TRIANGLE
      /* System.out.println("Enter your number");

        Scanner sc =new Scanner (System.in);

        int r = sc.nextInt();                   //****  4 ( 5-1)
        for(int i = 1; i<=r; i++){              //***   3  (5-2)
            for(int j=1;j<=(r+1-i); j++){       //**    2  (5-3)      LOGIC
                System.out.print("*");          //*     1  (5-4)
            }                                  // (4+1-i)
            System.out.println();              //(r+1-i)
        }*/
        //REVERSE TRIANGLE 2ND METHOD

       /* for (int i = 1; i <= 4; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }*/


        // rectangle
      /*System.out.println("Enter your no.");
        Scanner sc =new Scanner (System.in);
        int r = sc.nextInt();
        for(int i= 1; i<= r; i++){
            //spaces printing r-i
            for(int j = 1; j<=r-i; j++) {
                System.out.print(" ");
            }
                //star printing star  2*i-1\
                for(int k = 1; k<=2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();

        }*/
        //numeric pattern

        /*Scanner sc =new Scanner (System.in);
        int r = sc.nextInt();
        for(int i = 1; i<=r; i++){
            for (int j = i; j<=r;j++){
                System.out.print(j);
            }

            for(int k=1; k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }*/

        //numeric problem 2

       /* Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(j);
            }
            System.out.println();

        }*/

      /*  //printing hollow numarical rectangle
        for(int i = 1; i<= 5; i++){
            for(int j= 1; j<=5;j++){
                if( i== 1||i==5|| j==1||j== 5 )
                    System.out.print(j);

                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/


        //pattern 12121
        //       21212
      /*  for(int i= 1;i <= 5;i++){
            for(int j = 1; j<=5; j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }*/


        //inverted triangle

     /*   int n= 5;
        for(int i = n; i>=1; i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //rotated triangle

      /*  int n =5;
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //  number triangle
       /* int n =5;
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
//inverted number pattern
       /* int n = 5;
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++ ){
                System.out.print(j);
            }
            System.out.println();
        }*/

      /*  int n=5;
        int number = 1;
        for(int i=1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println();*/

        //ADVANCE PATTERN
        // upper half
       /* int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        //    lower bhalf
       for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }*/
        //soloid rombus

       /* int n= 5;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }for(int j= 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

     /*   int n= 5;
        for(int i = 1; i <=n ; i++){
            for(int j = 1 ; j<= n-i; j++){
                System.out.print(" ");
            }for(int j = 1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }*/
        /*int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j= 2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();



      }*/


    }
}
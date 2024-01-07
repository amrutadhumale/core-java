package com.company;

public class practice_by_apna_college {
    public static void main(String[] args) {
        //solid rectangle
       /* int n=4;
        int m=5;
        for(int i= 1 ; i<=n;i++){
            for (int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("\n");*/

        // hollow rectangle (emty rectangle)
     /*   int n = 4;
        int m=5;
        for(int i =1; i<=n;i++){
            for (int j =1;j <=m;j++ ){
                if (i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                   System.out.println("\n");*/
     /*   int n= 4;
        for ( int i= 1 ; i<=n ; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
                System.out.println("\n");*/

     /*   int n = 4;
        for ( int i= 1 ; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*") ;
            }
            System.out.println("\n");*/

        // inverted half rectangle
            /* int  n =4 ;
             for ( int i = n ; i>0; i--){
                 for (int j = 1 ;j<=i ; j++){
                     System.out.print("*");
                 }System.out.println("\n");*/


        //half rectangle 180 degree rotated

             /*    int n = 4;

                 for (int i= 1; i <=n; i++){
                     for ( int j = 1; j<=n-i; j++){
                         System.out.print(" ");
                     }
                     for (int j = 1; j<=i ; j++){
                         System.out.print("*");
                     }
                         System.out.println("\n");*/

        //no. 1st to  n in peramid pattern

            /* int n = 5;
             for( int i= 1; i <=n ; i++){
                 for (int  j=1; j<=i ; j++){
                     System.out.print(j+" ");

                 }
                 System.out.println("\n");*/

        // inverse no pattern

                /* int n= 5;
                  for (int i=n ;i >=1 ;i--){
                      for ( int j = 1; j<=i ; j++){
                          System.out.print(j+" ");

                      }
                      System.out.println("\n");*/

        // 2nd method

                     /* int n=5;
                      for (int i = 1;i <=n; i++){
                          for ( int j =1; j<=n-i+1; j++){
                              System.out.print(j);
                          }
                          System.out.println("\n");*/


        //for continuous no peramid

                        /*  int  n=5 ;
                          int number=1;
                           for  (int i =1 ; i <=n; i++){
                               for(int j= 1;j<=i;j++){
                                   System.out.print(number+" ");
                                   number++;
                               }
                               System.out.println("\n");*/

        // 0101  patten

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {//even
                    System.out.print("1 ");
                } else { // odd
                    System.out.print("0 ");
                }
            }
            System.out.println( "\n");


        }

    }
}



















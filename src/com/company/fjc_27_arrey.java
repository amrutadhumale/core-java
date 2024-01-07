package com.company;

import org.w3c.dom.ls.LSOutput;

public class fjc_27_arrey {
    public static void main(String[] args) {
     /*    float[] marks2 ={98.78f,90.67f,78.88f,67.54f,78.90f};
        System.out.println(marks[3]);
        System.out.println(marks.length);
        System.out.println(marks2[4]);
        String[] students=  { "HARRY", "AMRUTA",};
        System.out.println(students[2]);

        // displaying the arrey (for loop)
       /* for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }*/
        //quick quiz
      /*  System.out.println("printing using for loop in reverse order");
        for (int i= marks.length-1;i>=0; i--){
            System.out.println(marks[i]);
        }*/


        int[][] marks = {{98, 90}, {78, 67, 78}};

       System.out.println("printing using for-each loop");
//        for (int element: marks){
//            System.out.println(element);
//        }

        for (int i= 0;i<marks.length; i++){
            for (int j= 0;j<marks[i].length; j++) {

                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        }
}

package com.company;

public class fjc_28_multidiementional_arrey {
    public static void main(String[] args) {
        int [] marks; // A 1- d arrey
        int [][] flats; // A2-d arrey
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("printing a 2-d arrey usimng for loop ");
        for (int i= 0;i<flats.length;i++){
                for(int j= 0;j>flats[i].length;j++){
                    System.out.println(flats[i][j]);
                    System.out.println(" ");
                    System.out.println("");}


                }


    }
}

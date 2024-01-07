package com.company;

public class pallendrom {
    public static void main(String[] args) {
        //1st method
      /*  String str = "AMUMA";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();

        String s = gtr + "";
        if (str.equals(s)) {
            System.out.println("Pallendromic");
        } else {
            System.out.println("Not Palendramic");
        }*/


        //2nd method

        String str = "abcba";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true; // pallendrom
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)){
                flag = false ;
                break;
            }
            i++;
            j--;

        }
        if (flag ==true) System.out.println("Pallendrome");
        else System.out.println("not palendrome");

    }
}
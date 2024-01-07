package com.company;
import java.util.*;
public class Strings_by_college_wallah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String str = "Amruta dhumale";
        //System.out.println(str);
       /* String s = sc.nextLine();
        System.out.println(s);*/

     /*   String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(7));
        //char ch = str.charAt(5);
        int ind = str.indexOf('W');
        System.out.println(ind);*/



       /* String str = "Hello World";
        System.out.println(str.contains("llo"));
        System.out.println(str.endsWith("ld"));
        System.out.println(str.codePointAt(6));*/
      /*  String s1 = " AMU";
        String s2 = "ANKU";
       // System.out.println(s1.concat(s2));
        s1= s1+"vrdu";
        s1 += 'b' ;
        System.out.println(s1);*/

      /*  String s = "Physics";
        for(int i = 0 ; i<4;i++){
            System.out.println(s.substring(i));
        }*/

     /*   String str = "abcd";
        for(int i = 0 ; i<=3;i++){
            for(int j = i +1; j<=4 ;j++){
                System.out.print(str.substring(i,j)+" ");


            }

        }*/

        String str = "Hello";
        str = str.substring(0,2)+'y'+ str.substring(3);
        System.out.println(str);


    }
}

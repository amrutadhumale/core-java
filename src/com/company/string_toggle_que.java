package com.company;
import java.util.*;

public class string_toggle_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        //pHIsiCs-- PhiSIcS

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int asci = (int) ch; //65
            if (asci >= 97) flag = false;// small
            if (flag == flag) {
                asci += 32;
                char dh = (char) asci; //a
                str.setCharAt(i, dh);
            }else{ //small
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);


        }
    }
        System.out.println(str);
   }
 }
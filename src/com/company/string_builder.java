package com.company;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world ");
       // str+= "Happy to see";     (not allowed)
       // str.append("Happy to see");
        System.out.println(str);

        str.setCharAt(0,'R');
        System.out.println(str);
        str.insert(0, 't');
        System.out.println(str);
        System.out.println(str.deleteCharAt(2));
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(2,4);
        System.out.println(str);
    }


    }

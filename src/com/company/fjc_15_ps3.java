package com.company;

public class fjc_15_ps3 {
    public static void main(String[] args) {
     /* //  que1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //  QUE2 convert the space in underscore
        String text = "to lower case";
        text = text.replace(" ", "_");
        System.out.println(text);*/

       // que3
        String  letter= "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>","Amruta");
        System.out.println(letter);


       // que4
        String Mystring = "this string contins  double    and triple spaces";
        System.out.println(Mystring.indexOf("  "));
        System.out.println(Mystring.indexOf("    "));

      //  que5
        String myletter = "Dear harry \n\t This java cource is nice.\n\t Thanks";
        System.out.println(myletter);




    }
}

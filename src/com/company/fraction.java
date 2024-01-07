package com.company;

public class fraction {
    int num ;
    int den;

    public fraction(int i, int i1) {
    }

    public static fraction  add ( fraction f1, fraction f2){
        int numerator= f1.num*f2.den+ f1.den*f2.num;
        int denominator = f1.den*f2.den;
        fraction f3 = new fraction (numerator ,denominator);
        return f3;

    }
    public static void main(String[] args) {
        fraction f1 = new fraction ( 35,21);
        System.out.println(f1.num+"/"+f1.den);



    }
}

package com.company;
class c1{
    public int x = 5;
    protected int y= 45;
    int z= 65;
    private int a = 45;
    public void name(){
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
public class Excess_M0difier {
    public static void main(String[] args) {

        c1 c = new c1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
       // System.out.println(c.a);
    }
}

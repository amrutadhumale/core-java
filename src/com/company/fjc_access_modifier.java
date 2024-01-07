package com.company;
class C1{
    public int x = 5;
    protected int y = 6;
    private int a = 78;
    int z= 8;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}

public class fjc_access_modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth();
        // in same class all methods are able to run
        // in same package only public protected and default method can be run private method is able to run in same package
        //in subclasses like in inheritance onlypublic nad protected method can be run and not the default and private
        //in different world e.g in different file only public method is run and not the remaining




    }
}

package com.company;

import org.w3c.dom.ls.LSOutput;

class base {
    int x ;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("im setting x now");
        this.x = x ;
    }
    public void printme(){
        System.out.println("i am a constructor");
    }
}
class derived extends base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class practice_inheritance {
    public static void main(String[] args) {
        System.out.println("amu is a good girl");
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        derived d = new derived();
        d.setY(6);
        System.out.println(d.getY());



















    }
}

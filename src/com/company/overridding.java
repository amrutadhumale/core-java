package com.company;

import org.w3c.dom.ls.LSOutput;

class Animal {

    public void Sleep (){
        System.out.println("Sleeping");
    }
    public void eating ( ){
        System.out.println("Eating");


    }
    public void sleep(int hours){
        System.out.println("Sleeping 8 hours");
        hours = 8;
    }
}
class Dog extends Animal {
    public void bark (){
        System.out.println("Barking");
        System.out.println("Jumping");

    }
    public int finger (){
        return 4;
    }
    @Override
    public void eating (){
        System.out.println("I am eating");

    }
}


public class overridding {
    public static void main(String[] args) {
        Dog d = new Dog ();
        d.finger();
        System.out.println(d.finger());
        d.sleep(6);
        }



    }


package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("changing the nib");
    }
    void changenib(){
        System.out.println("changing the nib");
    }
}

class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir");
    }
    public void eat(){
        System.out.println("eating...");

    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}

public class fjc_practicset_11_60 {
    public static void main(String[] args) {
        //Q1+Q2
        fountainpen pen = new fountainpen();
        pen.changenib();

        //Q3
        Human Amruta = new Human();
        Amruta.sleep();

        //q5
        monkey M1 = new Human();
        //M1.speak()--> cannot use speak method becouse the refernce is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        lovish.sleep();
        lovish.eat();
       // lovish.speak();---> cannot implement because the reference is BasicAnimal which does not have speak method

    }

}

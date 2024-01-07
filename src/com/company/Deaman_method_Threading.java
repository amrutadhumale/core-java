package com.company;

class deva  extends Thread{

    public void run(){
        if (Thread.currentThread().isDaemon()){

            System.out.println("Krishn sada sahayte");

        }else{
            System.out.println("Hare Krishna");
        }

    }

}
public class Deaman_method_Threading {
    public static void main(String[] args) {
        System.out.println("Main Method");
        deva krishn =new deva ();
        krishn.setDaemon(true);
        krishn.start();
    }
}

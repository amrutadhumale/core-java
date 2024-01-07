package com.company;
class test extends Thread{
    public void run(){
        System.out.println("Threading");
    }
}
class Test2 extends Thread {
    public void run (){
        System.out.println("Executing");
    }
}
public class threading_types {
    public static void main(String[] args) {
        test t = new test();
        test t2 = new test();  // This is caleed performing single task from multiple Threads
        t.start();
        t2.start();  // in this ase there are 3 threads including mani thread
        // it is not possible to run multiple task from one thread
        Test2 ts = new Test2();
        ts.start();       // for performing multiple task it is important to create multiple classes and threads

    }
    }
package com.company;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run() {
        int i = 12;
        System.out.println(i);
        System.out.println("Thank you");
        //while(true){
        System.out.println("I am a thread");
     }
    }




public class fjc_73_multithreading {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Amruta");

        t1.start();
        t1.getName();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of thread t1 is" + t1.getName());



    }
}

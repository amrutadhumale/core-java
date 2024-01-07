package com.company;
 class Test5 extends Thread {
     public void run() {
         System.out.println("Thread Task is executed by" + Thread.currentThread().getName());

     }
 }
   /* class Test2 extends Thread {
        public void run(){
            System.out.println("Thread task is executed by"+ Thread.currentThread().getName());
        }
    }*/

public class contructors_in_threadin {
    public static void main(String[] args) {
       /* System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Amruta");
        System.out.println(Thread.currentThread().getName());*/
        System.out.println("Hello is printed by" +Thread.currentThread().getName());
        Test5 t = new Test5();
        t.setName(" Amruta");
        t.start();
        System.out.println(Thread.currentThread().isAlive());
        Test5 t2 = new Test5();
        t2.setName(" Smart Programming");
        t2.start();
        System.out.println(Thread.currentThread().isAlive());

    }
}

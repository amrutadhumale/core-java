package com.company;
class practiceset13a extends Thread{
    public void run(){
        int i =0;

        while(i<30){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class practiceset13b extends Thread{
    public void run(){
        int i = 0;
        while(i<20){
            i++;
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");

        }
    }
}
public class fjc_76_practiceset {
    public static void main(String[] args) {
        practiceset13a p1 = new practiceset13a();
        practiceset13b p2 = new practiceset13b();
        p1.setPriority(6);
        p2.setPriority(2);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p2.getState();
        System.out.println(p2.getState());
        p1.start();
        p2.start();

    }
}
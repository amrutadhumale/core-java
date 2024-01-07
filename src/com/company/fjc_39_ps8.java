package com.company;
class Employee2{
    int salary;
    String name ;
    public int getSalary(){
        return salary;

    }

    public String getName() {
        return name;
    }
     public void setName(String n){
        name=  n;
    }

    public char setname() {
        return 0;
    }

    class Cellphone{
        public void ring(){
            System.out.println("ringing...");
        }
    }public void vibrate() {
        System.out.println("vibrating...");
    }
        public void callfriend(){
        System.out.println("calling...");

    }


}


public class fjc_39_ps8 {
    public static void main(String[] args) {
      //  que1
        Employee2 amruta= new Employee2();
        amruta.setName("codewithamruta");
        amruta.salary= 466;
        System.out.println(amruta.getSalary());
        System.out.println(amruta.setname());


       // que2




    }
}

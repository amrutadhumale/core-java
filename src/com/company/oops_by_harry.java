package com.company;

import org.w3c.dom.ls.LSOutput;

class Employee{
    int id;
    String name ;
    int salary;
    public void printdetails(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
    public int getsalary(){
        return salary;
    }

}
public class oops_by_harry {
    public static void main(String[] args) {
        System.out.println("this is our  first oops class");
        Employee Amruta =new Employee();
        Amruta.id = 12;
        Amruta.name ="codewithamu";
        Amruta.salary =70000;
      // System.out.println(Amruta.id);
      //System.out.println(Amruta.name);
        Amruta.printdetails();
        int salary =Amruta.getsalary();
        System.out.println(salary);

    }
}

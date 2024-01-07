package com.company;
abstract class parent2 {
    public parent2(){
        System.out.println("mai parent2 ka abstractor hu");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();


}
 class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");

        }
        public void greet2(){
            System.out.println("amu is a good girl");
    }
 }
  abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }
 }

public class fjc_abstract_class {
    public static void main(String[] args) {
        child2 ch =new child2();
    }
}

package com.company;
interface sampleInterface{
    void meth1();
    void meth2();

}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class MySampleClass implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("Calling meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("Callig meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("method 3 calling");
    }

    @Override
    public void meth4() {
        System.out.println("Meth four calling");
    }
}
public class inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();


        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();




    }
}

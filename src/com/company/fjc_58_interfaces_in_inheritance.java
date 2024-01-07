package com.company;
interface sampleinterface {
    void meth1();

    void meth2();

}
    interface mysampleclass extends sampleinterface {
        void meth3();
        void meth4();
    }
    class childsampleclass implements mysampleclass {
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");

        }
        public void meth4(){
            System.out.println("meth4");
        }
    }



public class fjc_58_interfaces_in_inheritance {
    public static void main(String[] args) {
        childsampleclass obj = new childsampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();


    }
}

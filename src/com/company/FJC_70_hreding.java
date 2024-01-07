package com.company;

class MyThread1 extends Thread {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My thread is Running");
            System.out.println("I am happy!");
            i++;

        }
    }
}

    class MyThread2 extends Thread {
        public void run() {
            int i = 0;

            while (i < 30000) {
                System.out.println("Thread2 is good");
                System.out.println("I am joyfull!");
                i++;


            }
        }


    }

    class FJC_70_hreding {


        public static void main(String[] args) {
            MyThread1 t1 = new MyThread1();
            MyThread2 t2 = new MyThread2();
            t1.start();
            t2.start();
        }

    }




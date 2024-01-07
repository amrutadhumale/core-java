package com.company;
interface bicycle {
    void applyBrake(int decrement);

    void speedup(int increment);
}
    class RangeRover implements bicycle{
         int braek = 5;
        void car (){
            System.out.println("Having car");
        }

       public  void  applyBrake(int decrement){
            System.out.println("Applying break");
        }
       public  void speedup(int increment){
             System.out.println("incrementing speed");
         }


    }

public class interface_in_java {
    public static void main(String[] args) {
        RangeRover r = new RangeRover();
       r.applyBrake(2);
       r.speedup(5);

    }
}

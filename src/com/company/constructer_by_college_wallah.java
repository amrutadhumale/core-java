package com.company;

public class constructer_by_college_wallah {

    public static class student2 {
        String Name ;
        int rno;
        double per;
       // static int noofstudents;
        private static int noofstudents;

       /* public studen2(){


       } */

        public student2(String naam,int roll , double percent){
            Name =naam;
            rno= roll;
            per=percent;
            noofstudents++;


            //implementation of this
          /*  public student2(String =Name; int rno; double per );
            this.Name =Name ;
            this.rno=rno;
            this.per = per;*/






        }
       /* public int getNoofstudents(){   //to call private constructor
            return noofstudents;
        }*/


    }
    public static void main(String[] args) {

        System.out.println();
        student2.noofstudents = 100;
        System.out.println(student2.noofstudents); //it canot work when constructer is private
        student2 s2= new student2("Amruta", 76,56);
        System.out.println(s2.noofstudents);
        student2 s3 = new student2("Raghav", 57,93.68);
        System.out.println(s2.Name);
        System.out.println(s3.rno);
        System.out.println(s3.noofstudents);


    }
}

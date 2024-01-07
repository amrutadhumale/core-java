package com.company;

public class getter_setter_by_college_wallah {

    public static class student1 {
        public String name;
        private int rno;
        double percentage;

        public int getRno() {
            return rno;
        }

        public void setRno(int x){
            rno=x;
        }

    }
    public static void main(String[] args) {
        student1 s = new student1();
        System.out.println(s.getRno());
       s.setRno(45);
        System.out.println(s.getRno());





    }
}

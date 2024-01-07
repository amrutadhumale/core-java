package com.company;
class circle{
    private double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if (radius>=0){
            this.radius =radius;
        }else{
            System.out.println("Invalid radius. Radius must be non- negative");
        }

    }
    public double getCircumference(){
        return 2* Math.PI*radius;
    }
}
public class getter_setter_practice {
    public static void main(String[] args) {
        circle myCircle = new circle();
        myCircle.setRadius(5.0);
        System.out.println("radius");
        System.out.println("circumference:" + myCircle.getCircumference());
    }
}

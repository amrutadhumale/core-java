/*class shape {
    String color;
}
class Triangle extends shape{

}*/

class shape{
    public void area(){
        System.out.println("displays area");

    }
}

class Triangle extends shape{
    public void area (int l, int h){
        System.out.println(1/2*l*h);
    }

}
class Circle extends shape{
    public void area (int r){
        System.out.println((3.14)*r*r);
    }
}



public class inheritance_by_apna_college {
    /*Triangle t1 =new Triangle();
    t1.color = "red"*/

}

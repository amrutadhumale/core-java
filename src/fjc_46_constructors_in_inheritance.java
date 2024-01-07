public class fjc_46_constructors_in_inheritance {
    static class base1 {
        base1() {
            System.out.println("i am a constuctor");
        }
        base1(int a) {
            System.out.println("i am an overloaded constuctor with value of a as: " +a);
        }
        public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
        static class Derived1 extends base1{
            Derived1(){
                super (0);
                System.out.println("I am a derived  class constuctor");
            }
            Derived1(int x ,int y){
                System.out.println("I am an overloaded constuctor of  derived  with value of y as:" + y);
            }


            public int y;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }
        }
        static class childofDerived extends Derived1{
        childofDerived(){
            System.out.println("I am a child of derived constuctor");
        }
        childofDerived(int x,int y,int z){
            super(x,y);
            System.out.println("I am a child of derived constuctor:" +z);
        }



        }


    public static void main(String[] args) {
        base1 b = new base1();
        Derived1 d = new Derived1();
        Derived1 f = new Derived1(14,9);
        childofDerived cd = new childofDerived();



    }
}
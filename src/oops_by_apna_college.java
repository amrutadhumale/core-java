/*class pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }


    public void printcolor() {

    }*/

    class Student {
        String name;
        int age;

        public void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);

        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //polymorphisumm
        public void printInfo(String name) {
            System.out.println(name);
        }

        public void printInfo(int age) {
            System.out.println(age);
        }

        public void printInfo(int age, String name) {
            System.out.println(name + " " + age);

        }


        public class oops_by_apna_college {
            public static void main(String[] args) {
                //  System.out.println("This is amu");
      /*  pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        
        
        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ballpoint";
        
        pen1.printColor();
        pen2.printColor();*/

                Student s1 = new Student("amruta", 21);
     /*   s1.name="amruta";
          s1.age=22;*/

                s1.printInfo();


            }
        }
    }

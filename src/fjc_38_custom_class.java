class Employee1{
    int id;
    String name;
    int salary;

    public void printdetails(){
        System.out.println("MY id is"+ id);
        System.out.println("and my name is "+name);
        System.out.println("my salary is " + salary);
    }
    public int getsalary(){
        return salary;

    }
}




public class fjc_38_custom_class {



    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee1 Amruta = new Employee1();//instantiating a new employee object
        Employee1 john = new Employee1();
        //setting attributes
       Amruta.id = 12;
       Amruta.name = "codewithamruta";
       Amruta.salary= 50;
       john.id = 19;
       john.name= "john marrie";
       john.salary=57;

       john.printdetails();
       Amruta.printdetails();


     //  System.out.println(Amruta.id);
      // System.out.println(Amruta.name);



    }
}

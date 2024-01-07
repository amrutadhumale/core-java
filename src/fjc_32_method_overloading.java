public class fjc_32_method_overloading {

    static void change (int a){
        a = 98;
    }

    static void foo (){
        System.out.println("good morning bro!");

    }
    static void foo ( int a, int b){
        System.out.println("good morning " + a + b + "  bro!");
    }

    static void foo(int a){
        System.out.println("good morning " + a + " bro!");
    }


    static void change2 (int[]arr){
        arr[0]= 98;
}
    static void telljoke(){
        System.out.println("i invented a new word !  \n"+
                "plagiarism!");}



    public static void main(String[] args) {
      //  telljoke();

       // int x= 45; // case 1 changing the integer
        //change (x);
      //  System.out.println("The value of x after running change is : + x");


       // case 2 changing the arrey
       /* int [] marks ={52, 78, 77, 89, 90, 96};
        change2 (marks);
        System.out.println("The value of x after running change is :" + marks[0]);*/

        // method overloading
        foo();
        foo (3000);//arguments are actual
        foo ( 7899,5688);

    }
}

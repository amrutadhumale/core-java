public class fjc_33_varargs {

   /* static int sum (int a, int b ){
        return a+b;
    }
    static int sum (int a , int b ,int c,int d) {
        return a + b + c + d;
    }*/
        static int sum(int ...arr){
            int result = 0;
            for(int a: arr){
                result+=a;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println("welcome to verargs");
        System.out.println("The sum of 4 and 5 is " + sum ( 4,5) );
        System.out.println("he sum of a,b ,c and d, e is "  + sum ( 6, 4, 5, 7, 8));
    }

}

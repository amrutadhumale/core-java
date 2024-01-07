public class fjc_35_ps7 {
    /*static void multiplication(int n){
        for (int i=1;i<= 10; i++){
            System.out.format("%d x %d = %d \n", n, i,n*i);*/

          /*  static void pattern1(int n){ //pattern problem
            for (int i=0; i<=n; i++){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }System.out.println();*/


       /* static int sumRec(int n){
              //base condition
              if( n==1){
                  return 1;
            }
              return n + sumRec(n-1);*/

    static void pattern2(int n){
        for(int i=n ;  i>=1; i--){
            for(int j =1 ;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
      /*  //write a java program for table n
       //multiplication(7);
        pattern1(5);*/

      /*  int c= sumRec(4);
        System.out.println(c);*/
       pattern2(5);
    }

}

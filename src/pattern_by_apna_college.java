public class pattern_by_apna_college {
    public static void main(String[] args) {
       /* //1
        int n = 5;
        //for upper half part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
          /*  for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }*/

        /*    //2 patern
        int n=5;
            for(int i= 1; i<=n; i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
            }
            //stars
              for(int j= 1; j<=5; j++){
                  System.out.print("*");

              }
        System.out.println();*/


       /* int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-1; j++) {
                System.out.println();
            }
            //number-> print row no, row no of time
            for (int j=1; j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                //1st half
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);

                }

                //2nd half
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();


            }
        }
    }







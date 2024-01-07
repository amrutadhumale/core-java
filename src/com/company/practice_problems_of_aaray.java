package com.company;
class ArraysExample {
    void searchInArrays() {
        int[] arr = {4, 9,7, 5, 9, 2, 7};
        int x = 9 ;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans ==-1){
            System.out.println("Not Found");
        }else
        System.out.println("find " + x + "at index" + ans);







      /* int[] arr ={5,6,8,3,6,9};
        int ans = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];

            }

        } System.out.println("Max " + ans);*/

    }
    }

    public class practice_problems_of_aaray {
        public static void main(String[] args) {
            ArraysExample obj = new ArraysExample();
            //obj.maxOfArrays();
            obj.searchInArrays();


            //   int[] [] marks = {{45,68,78},{45,89,46},{89,89,67}};
//        System.out.println(marks[0][2]);
//        System.out.println(marks[1][0]);
//        for (int i = 0;i<3;i++){
//            System.out.println(i);
//        }
       /* for(int [] n : marks){
            for(int n1 : n){
                System.out.print(n1+" ");
            }
            System.out.println();
        }*/


      /*  int[] arr ={1,6,8,6,9};
        int sum =0;
        for(int i = 0; i<arr.length; i++)
            sum = sum+arr[i];
        }
        System.out.println(sum);*/
       /* int[] arr ={5,6,8,3,6,9};
        int ans = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];

            }
            System.out.println(i);
        }*/


        }

    }

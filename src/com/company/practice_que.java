package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Scanner;

import java.util.Random;
import java.util.Arrays;

public class practice_que {
    public static void main(String[] args) {
        //Bitwise XOR operator (^)
    /*    int a= 20;
        int b = 10;
        a= a^b;
        b= a^b;
        a=a^b;
       // System.out.println(a+" "+b);

        b=a+b-(a=b);//righ to left execution
        System.out.println(a+" "+b);*/

        // 2nd que reverse number=================================================================================================


     /* System.out.println("Enter Your number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int rev =0;
        while(num!=0){             // num = 1234
            rev=rev*10+num%10;     // 0*10=0+1234=1234%10= 4 ; 4*10 = 40 + 3=43
            num=num/10;            //1234/10 =123 ; 123/10 =12    and same  till value gose to 1
        }
        System.out.println("Reverse Number is"+ rev);*/

        //using stringBuffer class=======================================================================

      /*  Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        StringBuffer rev;
        StringBuffer sb  = new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println(rev);*/
        //=============================================================================================
      /*  Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         StringBuilder sb1 = new StringBuilder();
         sb1.append(num);
         sb1.reverse();
        System.out.println("The reverse number is"+sb1);*/


        // Reverse string====================================================================================
       /*  String str = "ABCD";//
         String rev = "";//
         int len = str.length();//
         for(int i = len-1 ; i >=0; i--){//
             rev =rev+str.charAt(i); // it consider index value that's why it take as a len -1
         }
        System.out.println("Reverse of string is " +rev);*/

        //reversing string by using character array=====================================================================

      /*  String str = "ABCD";
        String rev = "";
        char a [] = str.toCharArray();
        int len = a.length;
        for (int i = len-1 ; i >=0 ;  i--){
            rev =rev + a[i];
            System.out.println(rev);
        }*/
//================================================================================================
        //using string buffer class
       /* String str = "ABCD";
        StringBuffer sb = new StringBuffer(str);
                sb.reverse();
        System.out.println(sb);*/

//============================================================================================
        //3que pallendrom

     /*Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int num = sc.nextInt();
        int org_num= num;
        int rev = 0 ;
        while (num!=0)
        {
            rev = rev*10+ num%10;
            num=num/10;
        }
        if (org_num==rev){
            System.out.println(org_num +"  pallendrom number");
        }else{
            System.out.println(org_num+" not pallendrom");
        }*/
//=====================================================================================
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String str =sc.next();
        String org_str= str;
        String rev = "";
        int len = str.length();
        for ( int i = len -1 ;i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        if(org_str==rev){
            System.out.println("It's pallendrom");
        }else {
            System.out.println("It's not pallendrom");
        }*/
//=========================================================================================
        //que 4
       /*  int n = 1234;
         int count = 0;
         while(n>0){
             n = n/10;
             count++;
         }
        System.out.println("NUMBER count is "+count);*/
//====================================================================================
     /*   int n = 2435725;
        int even = 0;
        int odd =0;
        while (n>0){
           int reminder = n %10;
           if (reminder %2==0){
                even++;
            }else{
                odd++;
            }
           n = n/10;
         //   System.out.println(even +" "+odd);
        }  System.out.println(even +" "+odd);*/
//===========================================================================================
        //sum of given digit

      /*  int num = 12345;
        int sum =0;

        while(num>0){

           sum = sum +num%10; //5
           num =num/10; //123

        }


        System.out.println("Sum of number is: "+sum);*/
//=======================================================================================
        //Different way of finding largest one

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc. nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();

        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        int largest = c>(a>b?a:b)?c:(a>b?a:b); //same but combined statement
        System.out.println(largest2+" is a largest number");*/

//============================================================================================
        //FIBONACHI SERIES6

      /*  int n1 = 0 ,n2 = 1, sum =0;
        System.out.println(n1+""+ n2);
        for(int i =2 ; i<10;i++){
                    sum = n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;
        }*/
        //====================================================================================================
        // PRIME NUMBER

      /*  Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <=num; i++) {
                if (num % i == 0)
                    count++;

            }
                    if (count == 2) {
                        System.out.println("Prime number");
                    } else{
                    System.out.println("Not a prime number");
                }
            } else{
            System.out.println("Not a prime number");
        }*/
        //===========================================================================================================

        //  GENERATING RANDOME NUMBER OR STRING
     /*   Random rd = new Random();
        //rd.nextInt();
     //   System.out.println(rd);

       int rd_int= rd.nextInt(100);
        System.out.println(rd_int);
        double rd_dub=rd.nextDouble(700);
        System.out.println(rd_dub);
        System.out.println(Math.random());
        //appach3- Apache common -lang API*/

        // factorial
        //===================================================================================================
     /*   Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial =1;
        for (int i = 1; i<=num ;i++ ){
            factorial = factorial*i;
            System.out.println(" Factorial of a Number is : "+ factorial );
        }
        //System.out.println(" Factorial of a Number is : "+ factorial );
*/

        //==================================================================================================


    /*      int a []= { 2,4,6,4,7};
          int sum = 0;
          for (int i = 0; i<a.length-1;i++){
              sum= sum +a[i];
          }
        System.out.println("Sum of Array Element "+sum);*/

        //Enhance for loop method
     /*   int a[] = {4,76,84,98,37};
        int sum =0;
        for(int value : a){
            sum = sum+value;
        }
        System.out.println("the sum of arrey is : "+sum);*/
//========================================================================
        // even odd number printing from array
        //   int a[] ={1,2,3,4,5,6,7};
      /*  System.out.println("Even number in array............");

        for(int i = 0; i <a.length; i++){
            if (a[i]%2 ==0)
                System.out.println(a[i]);
        }
//=====================================================================================
        System.out.println("Odd number in array............");
        for (int i =0 ; i<a.length; i++){
            if (a[i]%2==0)
                System.out.println(i);
        }*/
        //Enhance for loop
       /* int a[] ={1,2,3,4,5,6,7};
        for (int v :a ){
            if (v%2==0)
                System.out.println(v);
        */
        //==========================================================================================

        // whether 2 arrays are equal or not
      /* int a1 []  = {1,2,3,4,5,6};
       int a2 []  = {1,2,3,4,5,6};
       boolean status = Arrays.equals(a1,a2);
       if ( status == true){
           System.out.println("Arrays are Equal");
       }else{
           System.out.println("Arras are not equal");
       }*/
//========================================================================================
      /*  int a1 []  = {1,2,3,4,5,6};
        int a2 []  = {1,2,3,4,5,6};
        boolean status =true;
        if(a1.length==a2.length){
            for(int i = 0; i<a1.length;i++){
                if (a1[i] != a2[i]){
                    status = false;
                }
            }

        }else{
            status= true ;
        }*/

//============================================================================================

      /*  int a[] = {1,2,4,5};
        int sum1 = 0;
        for (int i = 0 ;i<a.length ;i++){
            sum1=sum1+a[i];
        }
        System.out.println("sum of elements in array:"+ sum1);
        int sum2 = 0;
        for (int i=1 ;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("sumof element in array :"+ sum2);
        System.out.println("Missing Number is:"+(sum2-sum1));
        */
        //===============================================================================================
        //max element in array

       int a [] = {50,69,49,30,29};
        int max = a[0];                              //min=a[0];

        for (int i =1 ; i<a.length-1; i++){
            if(a[i]>max){                          // for min value  if(a[i]<min)
                max =a[i];                         // min = a[i]
            }
        }
        System.out.println("Maximum element in array is:"+ max);

//==================================================================================================

        // duplicate element finding

       /* String arr[]= {"java" ," c", "c++", "Python", "java"};
        boolean flage = false;
        for (int i = 0; i <arr.length; i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(" Found Duplicate Elment:" +arr[i]);
                    flage = true;
                }
            }

        }if (flage==false){
            System.out.println("Duplicate Not Found");
        }*/
//==========================================================================================
        // approach 2 using hashset

       String arr[]= {"java" ,"c", "c++", "Python", "java"};
        HashSet<String>langs =new HashSet();
        boolean flage = false;
        for (String l: arr){
            if(langs.add(l)==false){
                System.out.println("Found Duplicate Element "+l);
                flage = true;

            }
        }if (flage==false) {

              System.out.println("Duplicate value not found");
            }

        //==================================================================================================
       /* Scanner sc = new Scanner(System.in);

        int arr[] = {23, 54, 74, 38, 90, 83, 87};
        int element = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == element) {
                System.out.println(element + " present in Array at: " +arr[i] );
                flag=true;
            }
            }if(flag==false){
            System.out.println(element+ " not found");
        } */
        //=============================================================================================


      //  sorting array (bubble sort)

     /*  int a []= {4,2,7,5,9};
        System.out.println("Array before sorting "+Arrays.toString(a));
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for (int j =0;j<n-1;j++){
                if (a[j]>a[j+1]){
                    int temp = a [j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        System.out.println("Array After sorting"+Arrays.toString(a));*/

        //=========================================================================
        // sort the elments using parellel sort
        /* int a[] ={39,93,54,85,58};
        System.out.println("Array before sorting "+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array after sorting "+Arrays.toString(a));*/
//===================================================================================
        //sort array with sort method
    /*    int a[] ={39,93,54,85,58};
        System.out.println("Array before sorting "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array after sorting "+Arrays.toString(a));*/

 //====================================================================================
        // removing anything from the array
       /* String s =" *^$$@*!(~(@*###&#*@@2  Selenium ! @@^@&@%&17  java";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);*/
 //====================================================================================

        // removing the white spaces in string

       /* String str = " java    python     selenium";
        System.out.println("String before replacement"+str);
        str= str.replaceAll("\\s","");
        System.out.println("String after removing white spaces"+str);*/

//===========================================================================================
      /*  String s= "Java programming java loops";
        int total_count =s.length();
        int count_afterremoving_=s.replaceAll("a","").length();
        int count = total_count - count_afterremoving_;
        System.out.println("Number occurances of a is "+count);*/


//===============================================================================================


//count number of words
     /*   System.out.println("Enter your String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =1 ;
        for (int i = 0 ; i<s.length()-1;i++){
            if ((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
            {
                count++;
            }
        } System.out.println("Number of words in a string "+count);*/

//===================================================================================================
        //revese full string
       /* System.out.println("Enter your String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       StringBuffer str = new StringBuffer(s);


        for (int i = 0;i<s.length()-1;i++)
        {
            if((s.charAt(i)==' ')&&(s.charAt(i-1)!=' ')){
            System.out.println(str.reverse().length()-1);
               break;

        }
        }  System.out.println("NEW STRING:"+str); */

        //reverse each word of the string  at their own site

       /* String str = " Welcome to java and selenium";
        String[] words = str.split(" ");
        String reverseString= "";
        for(String w: words){
            String reverseword ="";
            for (int i = w.length()-1; i>=0 ; i--){
                reverseword= reverseword+w.charAt(i);
            }
            reverseString= reverseString+reverseword+" ";


        }
        System.out.println(reverseString);*/
        //approach 2
       /* String str = "Welcome to java";
        String []words = str .split(" ");
        String reversewords = "";
        for (String w : words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reversewords = reversewords+sb.toString()+" ";


        }
        System.out.println(reversewords);*/


     }


        }



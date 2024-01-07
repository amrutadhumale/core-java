package com.company;

import java.util.HashMap;
import java.util.*;

public class MaxFrequency_Hashmap {
    public static void main(String[] args) {
        int[] arr ={ 1,4,3,4,6,3,5,3,4};
        HashMap<Integer,Integer>freq =new HashMap<>();
        for(int el : arr){
            if (!freq.containsKey(el)){
                freq.put(el,1);

            }else{
                freq.put(el,freq.get(el)+1);

            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int maxFreq =0,  anskey = -1;
       /* for (var key: freq.entrySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                anskey = key;



          }
        }*/



        for (var e: freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq= e.getValue();
                anskey= e.getKey();
            }
        }
        System.out.printf("%d has max frequency and  it occurs %d times",anskey, maxFreq);
    }
}

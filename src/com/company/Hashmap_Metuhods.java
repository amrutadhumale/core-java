package com.company;

import java.security.Key;
import java.util.HashMap;

public class Hashmap_Metuhods {
    static void Hashmap() {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));


        mp.remove("Akash");
        System.out.println(mp.get(25));///null
        System.out.println(mp.containsValue(19));
        System.out.println(mp.containsKey("lav"));
        mp.putIfAbsent("Yashika", 30);
        System.out.println(mp.get(30));//null
        System.out.println(mp.values());
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        //for (Map.Entry<String, Integer> e:mp.entrySet()){
        // System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue);

 //   }


}

    public static void main(String[] args) {
        Hashmap();

    }
}

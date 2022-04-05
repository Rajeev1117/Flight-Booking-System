package com.example.rajeev;

import java.util.HashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        HashMap<Integer,Double> map=new HashMap<Integer,Double>();
        map.put(1, 1.11);
        map.put(2, 2.21);
        map.put(3, 3.31);
        map.put(4, 4.41);
        map.put(5, 5.15);
        map.put(6, 6.16);
        map.put(7, 7.17);
        map.put(8, 8.18);
        map.put(9, 9.19);
        map.put(10, 10.01);

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

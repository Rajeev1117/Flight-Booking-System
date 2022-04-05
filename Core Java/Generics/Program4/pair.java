package com.example.rajeev;
import java.util.*;

class pair {
    public static void main(String[] args) {

        try {
            Pair1<String> obj1 = new Pair1<>();
            obj1.setKey("1");
            obj1.setValue("Hello");
            System.out.println("key: " + obj1.getKey()+ " , Value: " + obj1.getValue());

            Pair1<Date> obj2 = new Pair1<>();
            obj2.setKey("hello");
            obj2.setValue(new java.util.Date());
            System.out.println("Key: " + obj2.getKey()+ " , Value: " + obj2.getValue());

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}

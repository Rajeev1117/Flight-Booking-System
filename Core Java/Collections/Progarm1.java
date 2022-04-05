package com.rajeev;
import java.util.*;

public class Progarm1<key, value> {
    private key Key;
    private value Value;

    public Progarm1(key key, value value) {
        super();
        Key = key;
        Value = value;
    }

    public key getKey() {
        return Key;
    }

    public void setKey(key key) {
        Key = key;
    }

    public value getValue() {
        return Value;
    }

    public void setValue(value value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Pair [Key=" + Key + ", Value=" + Value + "]";
    }

    public static void main(String[] args) {

        Progarm1<Integer, String> myObj = null;
        Progarm1<String, Date> pair = null;

        myObj = new Progarm1<Integer, String>(1, "Hello");
        System.out.println(myObj.toString());

        pair = new Progarm1<String, Date>("Today is", new java.util.Date());
        System.out.println(pair.toString());
    }
}

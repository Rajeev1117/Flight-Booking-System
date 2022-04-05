package com.example.rajeev;
import com.sun.jdi.InvalidTypeException;

import java.util.Date;

public class Pair1<T extends Comparable<T>> {
    String key;
    T value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public <Pair1> void setValue(T value) throws Exception {
        if (value.getClass() == String.class || value.getClass() == Date.class) {
            this.value = value;
        } else {
            throw new InvalidTypeException("Only accept String or Date");
        }
    }
}

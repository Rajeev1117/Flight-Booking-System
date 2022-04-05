package com.example.rajeev;

import java.util.Arrays;

public class program3 {
    public static void main(String[] args) {
        Integer[] arr = {5,9,2,10,16,7,15,1,0};
        exchangePositions(arr,2,arr.length-1);

        String[] str = {"aman" , "mukesh", "raj" , "suresh" };
        exchangePositions(str, 1, 0 );

    }
    public static <T> void exchangePositions(T[] arr, int idx1 , int idx2)
    {
        System.out.println("Before Exchange : " + Arrays.toString(arr));
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        System.out.println("After Exchange : " + Arrays.toString(arr));
    }

}

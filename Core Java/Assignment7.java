package com.example.Rajeev;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {5 , 12 , 14 , 6 , 78 , 19 , 1 , 23 , 26, 35, 37 , 7 , 52, 86 , 47};

        int n = scn.nextInt();

        for(int i= 0 ; i<arr.length ; i++){

            if(n==arr[i]){
                System.out.println("Element is Present at index " + i);
                break ;
            }
        }
    }
}

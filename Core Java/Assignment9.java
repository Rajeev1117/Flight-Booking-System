package com.example.Rajeev;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3= new int[3];

        System.out.println("First student marks in subject A, B, C : ");
        int total1 = 0 ;

        for(int i = 0 ; i<3 ; i++){
            arr1[i] = scn.nextInt();
            total1 +=arr1[i];

        }
        System.out.println("First student total marks and average marks in all the subjects : ");
        System.out.println(total1 + " " +  total1/3);

        System.out.println("Second student marks in subject A, B, C : ");
        int total2 = 0;
        for(int i = 0 ; i<3 ; i++){
            arr2[i] = scn.nextInt();
            total2 +=arr2[i];

        }
        System.out.println("Second student total marks and average marks in all the subjects : ");
        System.out.println(total2 + " " + total2/3) ;

        System.out.println("Third student marks in subject A, B, C : ");
        int total3= 0;
        for(int i = 0 ; i<3 ; i++){
            arr3[i] = scn.nextInt();
            total3 +=arr3[i];

        }
        System.out.println("Third student total marks and average marks in all the subjects : ");
        System.out.println(total3 + " " + total3/3) ;


        // total ans avg of sub 1
        int totalsub1 = arr1[0] + arr2[0] + arr3[0];

        int avg1 = totalsub1 /3 ;
        System.out.println("All the three students marks and average in subject A : ");
        System.out.println(totalsub1 + " " + avg1);

        int totalsub2 = arr1[1] + arr2[1] + arr3[1];

        int avg2 = totalsub2 /3 ;
        System.out.println("All the three students marks and average in subject B : ");
        System.out.println(totalsub2 + " " + avg2);

        int totalsub3 = arr1[2] + arr2[2] + arr3[2];

        int avg3 = totalsub3 /3 ;
        System.out.println("All the three students marks and average in subject C : ");
        System.out.println(totalsub3 + " " + avg3);

    }
}

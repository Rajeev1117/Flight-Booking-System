package com.example.Rajeev;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double principle = scn.nextInt();
        double rate = scn.nextFloat();
        double time = scn.nextInt();



        double SI = principle* rate * time / 100 ;

        double A = principle *(Math.pow((1 + rate / 100), time));

        double CI = A - principle ;
        System.out.println(SI);
        System.out.println(CI);
    }
}

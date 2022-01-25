package com.example.Rajeev;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        int sub1,sub2, sub3;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter sub1 marks");
        sub1=scn.nextInt();
        System.out.println("Enter sub2 marks");
        sub2=scn.nextInt();
        System.out.println("Enter sub3 marks");
        sub3=scn.nextInt();

        if (sub1>60 && sub2>60 && sub3>60) {
            System.out.println("Passed");
        }  else if((sub1>60 && sub2>60) || (sub1>60 && sub3>60) || (sub2>60 && sub3>60)) {
            System.out.println("Promoted");
        } else {
            System.out.println("failed");
        }
    }
}

package com.example.Rajeev;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=scn.nextInt();
        int temp, rem, sum=0;
        temp=n;
        while (temp!=0)
        {
            rem=temp%10;
            sum+=(int)Math.pow(rem, 3);
            temp/=10;
        }
        if(sum==n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong nummber");
    }
}

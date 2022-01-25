package com.example.Rajeev;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the CTC / Salary : ");

        int salary = input.nextInt();
        double tax = 0 ;

        if(salary <= 180000){
            // there is no tax applied to this slab
            tax = 0 ;
        }else if(salary>=181001 && salary<=300000){
            tax = salary * 0.10 ;
        }
        else if(salary<=500000){
            tax = salary * 0.20 ;
        }else if(salary <=1000000){
            tax = salary * 0.30;
        }

        System.out.println(tax);
    }

}

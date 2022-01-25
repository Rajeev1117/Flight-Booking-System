package com.example.Rajeev;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        for(int i=1 ; i<=3 ; i++){
            System.out.println("Enter usename");
            String user = scn.next();

            System.out.println("Enter Password");
            String pass = scn.next();

            if(user.equals("Rajeev") && pass.equals("1234")){
                System.out.println("Welcome " + user);
                return ;
            }
        }

        System.out.println("Contact Admin");
    }
}

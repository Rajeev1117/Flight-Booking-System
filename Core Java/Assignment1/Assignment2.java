package com.example.Rajeev;

public class Assignment2 {
    public static void main(String[] args) {
        int r=0;
        for(int i=100; i<1000; i++) {
            int temp=i;
            int sum=0;
            while(temp>0){
                r=temp%10;
                sum+=(r*r*r);
                temp/=10;
            }
            if (sum==i) {
                System.out.println(i);
            }
        }
    }
}

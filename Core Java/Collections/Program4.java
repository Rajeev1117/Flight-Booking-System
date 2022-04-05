package com.rajeev;
import java.util.*;

class date{
    static int month;
    static int day;
    static int year;


    public date(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static int getMonth() {
        return month;
    }

    public static int getDay() {
        return day;
    }

    public static int getYear() {
        return year;
    }


    public String toString() {
        return "" + day + ", " + month + " , " + year + "";
    }
}




public class Program4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<date> list=new LinkedList<>();
        list.add(new date(03,02,2000));


        System.out.println("Your date of birth is "+date.getMonth()+"-"+date.getDay()+"-"+date.getYear());

        {
            if(date.getYear()%4==0)
            {
                System.out.println("and it was a leap year");
            }
            else
            {
                System.out.println("and it was not a leap year");
            }
        }
        list.add(new date(03,02,2001));


        System.out.println("Your date of birth is "+date.getMonth()+"-"+date.getDay()+"-"+date.getYear());

        {
            if(date.getYear()%4==0)
            {
                System.out.println("and it was a leap year");
            }
            else
            {
                System.out.println("and it was not a leap year");
            }
        }
    }
}

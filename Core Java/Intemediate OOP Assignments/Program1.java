package com.example.Rajeev;

public class Program1 {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

    }
    final class Singletone
    {
        public void show()
        {
            System.out.println("hello");
        }
    }

    class A extends Singletone
    {
        public void show()
        {
            System.out.println("hi");
        }
    }
}

package com.example.rajeev;

import java.util.HashSet;

public class Program1 {
    int id;
    String name, department;
    double salary;

    public Program1(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

    void displayDetails() {
        System.out.println(toString());
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        HashSet<Program1> set=new HashSet<Program1>();

        Program1 e1 =  new Program1(1, "abc", "support", 1060.50);
        Program1 e2 =  new Program1(2, "pqr", "RMG", 1102.72);
        Program1 e3 =  new Program1(3, "xyz", "FS", 1260.59);

        set.add(e1);
        set.add(e2);
        set.add(e3);

        for(Program1 e:set){
            e.displayDetails();
        }
    }
}

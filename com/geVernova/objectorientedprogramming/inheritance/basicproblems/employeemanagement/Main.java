package geVernova.objectorientedprogramming.inheritance.basicproblems.employeemanagement;

public class Main {
    public static void main(String[] args) {
        // Employee System Demo
        System.out.println("--- Employee Management ---");
        Employee employeeOne = new Manager("krehtik", 101, 80000, 5);
        Employee employeeTwo = new Developer("Stuti", 102, 60000, "Java");
        Employee employeeThree = new Intern("Ayaan", 103, 15000, 6);

        employeeOne.displayDetails();
        System.out.println();
        employeeTwo.displayDetails();
        System.out.println();
        employeeThree.displayDetails();
    }
}

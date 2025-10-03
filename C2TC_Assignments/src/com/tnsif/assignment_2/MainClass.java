package com.tnsif.assignment_2;

public class MainClass {
    public static void main(String[] args) {
        // Demonstrating Student class
        Student s = new Student();

        // Demonstrating Commission class
        Commision emp = new Commision();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
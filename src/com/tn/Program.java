package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        School school = new School();

        int result = school.sum(15, 25);
        System.out.println("Result: " + result);

        int multiple = school.multip(21, 20);
        System.out.println("Multiple: " + multiple);

        float division = school.divi(3.5f, 5.2f);
        System.out.println("Division: " + division);

        Scanner sc = new Scanner(System.in);
        System.out.println("Firstname: ");
        String firtsname = sc.nextLine();
        System.out.println("Lastname: ");
        sc = new Scanner(System.in);
        String lastname = sc.nextLine();


        String fullName = school.getFullName(firtsname, lastname);
        System.out.println("fullName: " + fullName);
    }
}

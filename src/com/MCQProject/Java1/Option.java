package com.MCQProject.Java1;

import java.util.Scanner;

public class Option {
    int z;

    public int value() {
        System.out.print("\nYour answer : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        System.out.println();
        switch (choice) {
            case "a":
            case "A":
                z = 1;
                return z;
            case "b":
            case "B":
                z = 2;
                return z;
            case "c":
            case "C":
                z = 3;
                return z;
            case "d":
            case "D":
                z = 4;
                return z;
            default:
                System.out.println("Invalid Input");
                value();
                break;
        }
        return z;
    }
}

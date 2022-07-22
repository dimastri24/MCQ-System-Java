package com.MCQProject.Java2;

import java.util.Scanner;

public class TakeName {
    // class for getting the username
    String name;
    public String readName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        return name;
    }
}

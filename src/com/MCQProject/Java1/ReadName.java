package com.MCQProject.Java1;

import java.util.Scanner;

public class ReadName {
    String name;
    public String takeName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        return name;
    }
}

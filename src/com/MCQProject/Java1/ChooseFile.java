package com.MCQProject.Java1;

import java.util.Scanner;

public class ChooseFile {
    int set;
    public int takeFile() {
        System.out.println("\nCourse List");
        System.out.println("1. HTML");
        System.out.println("2. SQL");
        System.out.print("Enter the number course : ");
        Scanner m= new Scanner(System.in);
        set = m.nextInt();
        if (set != 1 && set != 2) {
            takeFile();
        }
        return set;
    }

}

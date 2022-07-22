package com.MCQProject.Java2;

/*
  @author Dimas Tri Raharjo
 * @version 1.8
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Programming Learning Center");

        TakeName setName = new TakeName();
        String name = setName.readName();

        // choosing mcq topics
        Scanner sc = new Scanner(System.in);
        String ch;
        boolean opts = true;
        while (opts){
            System.out.println("\nCourse List");
            System.out.println("1. HTML");
            System.out.println("2. SQL");
            System.out.println("3. Java Basic");
            System.out.println("4. Python");

            System.out.print("Enter the number of course : ");
            ch = sc.next();
            McqHtml html = new McqHtml();
            McqSql sql = new McqSql();
            McqJavaBasic java = new McqJavaBasic();
            McqPython python = new McqPython();

            switch (ch) {
                case "1":
                    System.out.println("\nHTML MCQ Start!");
                    html.displayQuestions();
                    System.out.println("MCQ taker : " + name);
                    html.displayGrade();
                    break;
                case "2":
                    System.out.println("\nSQL MCQ Start!");
                    sql.displayQuestions();
                    System.out.println("MCQ taker : " + name);
                    sql.displayGrade();
                    break;
                case "3":
                    System.out.println("\nJava Basic MCQ Start!");
                    java.displayQuestions();
                    System.out.println("MCQ taker : " + name);
                    java.displayGrade();
                    break;
                case "4":
                    System.out.println("\nPython MCQ Start!");
                    python.displayQuestions();
                    System.out.println("MCQ taker : " + name);
                    python.displayGrade();
                    break;
                default:
                    System.out.println("Please Choose Between 1-2");
            }
            opts = getYesOrNo("Do you want to continue?");
        }
    }

    // method for looping the test and asking for yes or no
    private static boolean getYesOrNo(String message) {
        // used when input invalid choice
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" +message+ "(y/n)?");
        String ch = terminalInput.next();

        // used for looping test
        while(!ch.equalsIgnoreCase("y") && !ch.equalsIgnoreCase("n")) {
            System.out.println("Chose between y or n");
            System.out.print("\n" +message+ "(y/n)?");
            ch = terminalInput.next();
        }
        return ch.equalsIgnoreCase("y");
    }
}

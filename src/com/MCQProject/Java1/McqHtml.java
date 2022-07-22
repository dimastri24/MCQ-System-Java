package com.MCQProject.Java1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class McqHtml {
    int totalQ;
    int correctAnswer = 0;
    String csvFile = "d:/campus/mcq project/excel/htmldupe.csv";
    File file = new File(csvFile);

    public int mcqHTML() {
        try {
            Scanner A = new Scanner(file);
            while (A.hasNext()) {
                String data = A.nextLine();
                String[] split = data.split(";");
                System.out.println();

                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);
                System.out.println(split[3]);
                System.out.println(split[4]);
                int answer = Integer.parseInt(split[5]);
                Option a = new Option();
                int set = a.value();
                if (set == answer) {
                    System.out.println("You are Correct!!");
                    correctAnswer++;
                } else {
                    System.out.println("Wrong answer!! The correct answer is " + split[answer]);
                }
                totalQ++;
            }
            A.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return correctAnswer;
    }
}

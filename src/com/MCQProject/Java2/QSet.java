package com.MCQProject.Java2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QSet {
    private BufferedReader file = null;
    private String csvFile;
    private String line;
    private int correctAnswer = 0;
    private int wrongAnswer = 0;

    // constructor for being inherit into every mcq class
    public QSet (String csvFileName) {
        this.csvFile = csvFileName;
    }

    public String getCsvFile() {
        return this.csvFile;
    }

    // method to read the question every line
    public void displayQuestions() {
        try {
            file = new BufferedReader((new FileReader(csvFile)));
            while (true) {
                try {
                    if ((line = file.readLine()) == null) break;
                    QBank question = parseQuestion(line);
                    displayQuestion(question);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // overloading method for display the question
    private void displayQuestion(QBank question) {
        System.out.println(question);
        // call the user input
        acceptUserOption(question);
        // counting correct and wrong answer
        if (question.isCorrect())
            ++correctAnswer;
        else
            ++wrongAnswer;
    }

    // method for getting user input answer
    private void acceptUserOption(QBank question) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your answer : ");
        String userOption = sc.next();
        question.setUserOption(userOption);
        System.out.println(question.getDisplayText());
    }

    // method for display the result of the mcq test
    public void displayGrade() {
        int totalQuestion = correctAnswer + wrongAnswer;
        int percentage = 0;
        percentage =(this.correctAnswer *100) /totalQuestion;
        System.out.println( "Total Question : " + totalQuestion + "\n" +
                            "Total Correct Answer : " + correctAnswer + "\n" +
                            "Total Wrong Answer : " + wrongAnswer + "\n" +
                            "Your Grade : " + percentage + "%");
    }

    // method for parsing data from the line
    private QBank parseQuestion(String line) {
        String[] question = line.split(";");
        QBank quest = new QBank(question[0], question[1], question[2], question[3],
                                question[4], question[5], question[6]);
        return quest;
    }


}

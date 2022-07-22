package com.MCQProject.Java1;

public class Main {
    public static void main(String[] args) {
        System.out.println("ABC Programming Center");
        ReadName setName = new ReadName();
        String name = setName.takeName();

        ChooseFile  loadFile = new ChooseFile();
        int file = loadFile.takeFile();
        if (file == 1) {
            McqHtml mcq = new McqHtml();
            int correctAnswer = mcq.mcqHTML();
            int total = mcq.totalQ;
            int numOfWrongAnswers = total-correctAnswer;
            int percentage =(correctAnswer*100)/total;
            System.out.println("MCQ taker : " + name);
            System.out.println("Total right question : " + correctAnswer);
            System.out.println("Total wrong question : " + numOfWrongAnswers);
            System.out.println("Your Grade : " + percentage + "%");
        }
        else if (file == 2) {
            McqSql mcq = new McqSql();
            int correctAnswer = mcq.mcqSQL();
            int total = mcq.totalQ;
            int numOfWrongAnswers = total-correctAnswer;
            int percentage =(correctAnswer*100)/total;
            System.out.println("MCQ taker : " + name);
            System.out.println("Total right question : " + correctAnswer);
            System.out.println("Total wrong question : " + numOfWrongAnswers);
            System.out.println("Your Grade : " + percentage + "%");
        }
    }
}

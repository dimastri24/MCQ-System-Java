package com.MCQProject.Java2;

public class QBank {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String userOption;
    private String correctOption;
    private String correctAnswer;
    private String displayText;
    private boolean isCorrect;

    // constructor for reading every line
    public QBank(String question, String option1, String option2, String option3,
                 String option4, String correctOption, String correctAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
        this.correctAnswer = correctAnswer;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getUserOption() {
        return userOption;
    }

    public void setUserOption(String userOption) {
        this.userOption = userOption;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    // method for displaying feedback of the answer
    public String getDisplayText() {
        String displayText = "";

        if (this.userOption.equals(this.correctOption)) {
            displayText = "You are correct!!\n";
            isCorrect = true;
        } else {
            displayText = "You are wrong!! The answer is " + this.correctAnswer + "\n";
            isCorrect = false;
        }
        return displayText;
    }

    // override using toString to print the text into String
    @Override
    public String toString() {
        return question + "\n" + option1 + "\n" + option2 + "\n" + option3 + "\n" + option4;
    }
}

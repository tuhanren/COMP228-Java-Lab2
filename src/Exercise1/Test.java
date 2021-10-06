package Exercise1;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Arrays;

import static java.lang.Double.parseDouble;

public class Test {

    private String[] questions;
    private String[] choices;
    private String[] userSelects = {"","","","",""};
    private String userSelect = null;
    private String[] correctAnswer = {"A","A","A","A","A"};
    private SecureRandom random;
    private int correctCount = 0;
    private int wrongCount = 0;
    //private double correctRate = 0;
    //constructor
    public Test(String[] questions, String[] choices, String[] userSelects) {
        this.questions = questions;
        this.choices = choices;
        this.userSelects = userSelects;
        this.random = new SecureRandom();
        this.correctCount = correctCount;
        this.wrongCount = wrongCount;
        //this.correctRate = correctRate;
    }
    //getters
    public int getCorrectAnswer() { return this.correctCount; }
    public int getWrongAnswer() { return this.wrongCount; }
    //public double getCorrectRate() { return this.correctRate; }
    //methods
    public void simulateQuestion() {

        for (int i = 0; i <questions.length; i++) {
             userSelect = (String) JOptionPane.showInputDialog(null,
                     questions[i], "Test",
                     JOptionPane.INFORMATION_MESSAGE,null,
                     choices, choices[0]);

             userSelects[i] = userSelect;

             JOptionPane.showMessageDialog(null,
                     generateMessage(i),
                     "Message",
                     JOptionPane.PLAIN_MESSAGE);
        }
        //correctRate = correctCount / questions.length * 100;
    }
    public boolean checkAnswer(int i) {
        if (inputAnswer(i).equals(correctAnswer[i])){
            correctCount += 1;

            return true;
        }
        else {
            wrongCount += 1;

            return false;
        }
    }
    public String generateMessage(int i) {
        if (checkAnswer(i)) {
            switch(1 + random.nextInt(4)) {
                case 1 -> { return "Excellent!"; }
                case 2 -> { return "Good!"; }
                case 3 -> { return "Keep up the good work!"; }
                case 4 -> { return "Nice work!"; }
                default -> {return  "err"; }
            }
        }
        else {
            switch(1 + random.nextInt(4)) {
                case 1 -> { return "No. Please try again!"; }
                case 2 -> { return "Wrong. Try once more!"; }
                case 3 -> { return "Don't give up!"; }
                case 4 -> { return "No. Keep Trying!"; }
                default -> {return  "err"; }
            }
        }
    }
    public String inputAnswer(int i) {

        return  userSelects[i];

    }

}

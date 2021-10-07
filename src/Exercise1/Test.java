package Exercise1;

import javax.swing.*;
import java.util.Random;

public class Test {
    //declare
    String[] questions = {"What is 1?\n A.123\n B.123\n C.123\n D.123",
            "What is 2?\n A.123\n B.123\n C.123\n D.123",
            "What is 3?\n A.123\n B.123\n C.123\n D.123",
            "What is 4?\n A.123\n B.123\n C.123\n D.123",
            "What is 5?\n A.123\n B.123\n C.123\n D.123"
    };
    String[] choices = {"A", "B", "C", "D"};
    String[] correctAnswer = {"A","A","A","A","A"};
    String[] userSelects = {"","","","",""};
    String userSelect;
    boolean check;
    int correctCount = 0;
    int wrongCount = 0;
    float correctRate;
    //methods
    public void simulateQuestion() {

        for (int i = 0; i <questions.length; i++) {
            userSelect = (String) JOptionPane.showInputDialog(null,
                    questions[i], "Test",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    choices, choices[0]);
             userSelects[i] = userSelect;
             checkAnswer(i);
             JOptionPane.showMessageDialog(null,
                     generateMessage(i),
                     "Message",
                     JOptionPane.PLAIN_MESSAGE);
        }

    }
    public void checkAnswer(int i) {
        if (userSelects[i].equals(correctAnswer[i])){
            check = true;
            correctCount += 1;
        }
        else {
            check = false;
            wrongCount += 1;
        }
    }
    public String generateMessage(int i) {
        Random random = new Random();
        if (check) {
            switch(1+random.nextInt(4)) {
                case 1 -> { return "Excellent!"; }
                case 2 -> { return "Good!"; }
                case 3 -> { return "Keep up the good work!"; }
                case 4 -> { return "Nice work!"; }
                default -> { return  "Good."; }
            }

        }
        else {
            switch(1+random.nextInt(4)) {
                case 1 -> { return "No. Please try again!"; }
                case 2 -> { return "Wrong. Try once more!"; }
                case 3 -> { return "Don't give up!"; }
                case 4 -> { return "No. Keep Trying!"; }
                default -> { return  "No. Keep Trying."; }
            }
        }
    }
    public void inputAnswer() {
        simulateQuestion();
        correctRate = (float)correctCount/ questions.length;//MUST process or it will be 0!
        String message = "Your correct count is: " + correctCount + "\n" +
                         "Your wrong count is: " + wrongCount + "\n" +
                         "Your correct rate is: " + correctRate;//Double.parseDouble(String.valueOf(correctCount))/5*100
        JOptionPane.showMessageDialog(null, message);

//        System.out.println(correctCount);
//        System.out.println(wrongCount);
//        System.out.printf("""
//                Your correct count is: %d
//                Your wrong count is: %d
//                Your correct rate is: %.2f \s""", correctCount, wrongCount,correctRate);
    }
}

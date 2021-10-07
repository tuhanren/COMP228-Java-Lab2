package Exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    //declare
    String[] questions = {"In which year did Sun Microsystems fund an internal corporate \n" +
                            "research project led by James Gosling, which resulted in a \n" +
                            "C++ -based object-oriented programming language that Sun called Java?\n" +
                          "A.1999\n " +
                          "B.1998\n " +
                          "C.1991\n " +
                          "D.1990",
                            "Which of the following editions of Java  contains the capabilities \n" +
                                    "needed to develop desktop and server applications?\n " +
                                "A.Java Enterprise Edition (Java EE)\n " +
                                "B.Java Enterprise Edition 2 (Java 2 EE)\n " +
                                "C.Java Standard Edition 8 (Java SE 8)\n " +
                                "D.Java Micro Edition (Java ME)",
                            "What does an instance variable describe?\n " +
                                "A.Behaviour of an object\n " +
                                "B.Height of an object\n " +
                                "C.Measurement of an object\n " +
                                "D.Properties of an object",
                            "When a method that specifies a return type other than void is called,\n" +
                                    " what must the method do when it completes its task? and completes\n" +
                                    " its task, the method must return a result to its calling method.\n " +
                                "A.It must return one result only to the statement one line after the line from which it was called\n " +
                                "B.It must return more than just one result to its caller\n " +
                                "C.It must return one result to the statement immediately after the method body\n " +
                                "D.It must return a result exactly to the point from which it was called",
                            "Which of the following Java program units defines a group of related objects?\n " +
                                "A.Java Class\n " +
                                "B.Java method\n " +
                                "C.Java\n " +
                                "D.Java default constructor"
    };
    String[] choices = {"A", "B", "C", "D"};
    String[] correctAnswer = {"C","C","C","D","A"};
    String[] userSelects = {"","","","",""};
    String userSelect;
    boolean check;
    int correctCount = 0;
    int wrongCount = 0;
    float correctRate;
    //methods
    public void simulateQuestion() {
        //define user select
        for (int i = 0; i <questions.length; i++) {
            userSelect = (String) JOptionPane.showInputDialog(null,
                    questions[i], "Test",
                    JOptionPane.QUESTION_MESSAGE, null,
                    choices, choices[0]);
            //collecting user input
             userSelects[i] = userSelect;
             //check answer
             checkAnswer(i);
             //generate message
             JOptionPane.showMessageDialog(null,
                     generateMessage(i),
                     "Message",
                     JOptionPane.INFORMATION_MESSAGE);
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

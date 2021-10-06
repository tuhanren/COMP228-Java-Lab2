package Exercise1;
import javax.swing.*;
import java.util.Arrays;

public class TestApp {

    public static void main(String[] args) {

        String question[] = {"What is 1?\n A.123\n B.123\n C.123\n D.123",
                "What is 2?\n A.123\n B.123\n C.123\n D.123",
                "What is 3?\n A.123\n B.123\n C.123\n D.123",
                "What is 4?\n A.123\n B.123\n C.123\n D.123",
                "What is 5?\n A.123\n B.123\n C.123\n D.123"};

        String choices[] = {"A", "B", "C", "D"};

        String userSelects[] = {"","","","",""};


        Test obj = new Test(question, choices, userSelects);
        obj.simulateQuestion();
        System.out.printf("""
                        number of correct: %d
                        number of wrong: %d
                        correct rate:%.2f%%""",
                obj.getCorrectAnswer(),
                obj.getWrongAnswer(),
                Double.parseDouble(String.valueOf(obj.getCorrectAnswer()))/5*100
                //obj.getCorrectRate()
        );
    }
}

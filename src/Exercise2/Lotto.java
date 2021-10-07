package Exercise2;

import java.util.Random;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;

public class Lotto {
    //declare
    int[] ranArray = new int[3];
    int arraySum;
    int userChoice;
    //constructor
    public Lotto() {
    }
    //method for the random array and the sum
    public int generateArray() {
        Random random = new Random();
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = random.nextInt(9-1)+1;
        }
        arraySum = IntStream.of(ranArray).sum();
        return arraySum;
    }
    public void simulateLotto() {
        for (int i = 0; i <= 5; i++) {
            //collecting user input and convert to Int type
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            //response for different conditions
            if(userChoice == generateArray()) {
                String message = "You Win!\n" +
                                "The Lucky Number is: " + generateArray();
                JOptionPane.showMessageDialog(null,message,"Lotte",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else if(userChoice != generateArray()) {
                String message = "Whoops! The lucky Number is: " + generateArray();
                JOptionPane.showMessageDialog(null,message,"Lotte",JOptionPane.ERROR_MESSAGE);
            }
            if(i == 4) {
                JOptionPane.showMessageDialog(null, "Computer Wins!","Lotte",JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
    }
}

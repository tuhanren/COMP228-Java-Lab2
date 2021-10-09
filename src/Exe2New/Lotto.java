package Exe2New;

import java.util.Random;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;

public class Lotto {
    //declare
    int[] ranArray = new int[3];
    int arraySum;
    int sum = 0;
    int userChoice;
    boolean win = false;
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
        for (int i = 0; i < 5; i++) {
            sum = generateArray();
            //collecting user input and convert to Int type
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            while (userChoice < 3 || userChoice > 27){
                JOptionPane.showMessageDialog(null,"Please enter a number between 3 - 27");
                userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            }
            //response for different conditions
            if(userChoice == sum) {
                win = true;
                String message = "You Win!\n" +
                        "The Lucky Number is: " + sum;
                JOptionPane.showMessageDialog(null,message,"Lotte",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else {
                String message = "Whoops! The lucky Number is: " + sum;
                JOptionPane.showMessageDialog(null,message,"Lotte",JOptionPane.ERROR_MESSAGE);
            }
        }
        if (!win){
            JOptionPane.showMessageDialog(null, "Computer Wins!","Lotte",JOptionPane.WARNING_MESSAGE);
        }
    }
}

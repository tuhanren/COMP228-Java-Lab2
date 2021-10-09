package Exercise2;
import javax.swing.JOptionPane;
import java.util.stream.IntStream;
public class LottoApp {

    public static void main(String[] args) {
        //declare
        int userChoice = 0;
        boolean win = false;
        Lotto lotto = null;

        for (int i = 0; i < 5; i++) {
            //create a new obj
            lotto = new Lotto();
            //get the array from Lotto class
            int[] array = lotto.generateArray();
            //sum the array with IntStream lib
            int arraySum = IntStream.of(array).sum();
            //collecting user input and convert to Int type
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            while (userChoice < 3 || userChoice > 27){
                JOptionPane.showMessageDialog(null,"Please enter a number between 3 - 27");
                userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            }
            //response for different conditions
            if(userChoice == arraySum) {
                win = true;
                String message = "You Win!\n" +
                        "The Lucky Number is: " + arraySum;
                JOptionPane.showMessageDialog(null,message,"Lotte",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else {
                String message = "Whoops! The lucky Number is: " + arraySum;
                JOptionPane.showMessageDialog(null,message,"Lotte",JOptionPane.ERROR_MESSAGE);
            }
        }
        if (!win){
            JOptionPane.showMessageDialog(null, "Computer Wins!","Lotte",JOptionPane.WARNING_MESSAGE);
        }
    }
}


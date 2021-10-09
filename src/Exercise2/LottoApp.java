package Exercise2;
import javax.swing.JOptionPane;

public class LottoApp {

    public static void main(String[] args) {
        Lotto lotto = null;
        int userChoice = 0;
        boolean wins = false;
        for (int i = 0; i < 5; i++) {
            lotto = new Lotto();
            int arraySum = lotto.generateArraySum();
            //collecting user input and convert to Int type
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            while (userChoice < 3 || userChoice > 27){
                JOptionPane.showMessageDialog(null,"Please enter a number between 3 - 27");
                userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try a number between 3 and 27"));
            }
            //response for different conditions
            if(userChoice == arraySum) {
                wins = true;
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
        if (!wins){
            JOptionPane.showMessageDialog(null, "Computer Wins!","Lotte",JOptionPane.WARNING_MESSAGE);
        }
    }
}


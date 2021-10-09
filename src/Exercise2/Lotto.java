package Exercise2;

import java.util.Random;

public class Lotto {
    //declare
    int[] ranArray = new int[3];
    //constructor
    public Lotto() {
        Random random = new Random();
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = random.nextInt(9-1)+1;
        }
    }
    //method for the random array and the sum
    public int[] generateArray() {
        return ranArray;
    }
}


package Exercise2;

import java.util.Random;
import java.util.stream.IntStream;


public class Lotto {
    //declare
    int[] ranArray = new int[3];
    int arraySum = 0;
    //constructor
    public Lotto() {
        Random random = new Random();
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = random.nextInt(9-1)+1;
        }
        arraySum = IntStream.of(ranArray).sum();
    }
    //method for the random array and the sum
    public int generateArraySum() {
        return arraySum;
    }
}


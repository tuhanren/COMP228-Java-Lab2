package Exercise2;

import java.util.Random;

public class Lotto {
    //declare
    int[] ranArray = new int[3];
    //constructor
    public Lotto(int[] ranArray) {
        this.ranArray = ranArray;
    }
    //method
    public int[] generateArray() {
        Random random = new Random();
        for (int i = 0; i < ranArray.length; i++){
            ranArray[i] = random.nextInt(9-1)+1;
        }
        return ranArray;
    }


}

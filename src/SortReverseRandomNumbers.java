import java.util.Arrays;
import java.util.Random;

public class SortReverseRandomNumbers {
    /*
    Create a program using arrays that sorts a list of integers
    in descending order.
    First, create an array of randomly generated integers.
     */
    public static void main(String[] args) {
        int[] testArray= randomReverse(10);
        System.out.println(Arrays.toString(testArray));

        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));

        for(int i = 0; i < testArray.length / 2; i++) {
        int j = testArray[i];
        testArray[i] = testArray[testArray.length - i - 1];
        testArray[testArray.length - i - 1] = j;

    }System.out.println(Arrays.toString(testArray));

        }

    public static int[] randomReverse(int len){
        Random random = new Random();
        int[] randomInt;
        randomInt=new int[len];
        for(int i=0; i<len; i++){
            randomInt[i]= random.nextInt(100);
        }
        return randomInt;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    /*
    Write a method called readIntegers that reads a comma delimited
    list of numbers entered by the user from the console,
    and then returns an array containing the numbers
    that were entered.

    Next write a method called findMin that takes the array as an
    argument and returns the minimum value found in that array.

    In the main method:
    Call the method readIntegers to get the array of integers
    from the user, and print these out using a method
    Call the findMin method, passing the array, returned
    from the call to the readIntegers method.
    Print the minimum element in the array,
    which should be returned from the findMin method.
     */
    public static void main(String[] args) {

        //the supposed String list that comes us from the scanner
        String[] scanArray = {"5", "2", "7", "4"};
        System.out.println(String.join(",", scanArray));
        //we copy the array address to scannedArray
        int[] scannedArray= readIntegers(scanArray);
        //we call the finMin method with the address of the int array
        findMin(scannedArray);
    }

    public static int[] readIntegers(String... numberList) {
        //creating a new int array
        int[] scannedArray = new int[numberList.length];
        //creating a counter:i
                int i=0;
        //looping mit foreach loop through the given String numbers
                for (String t : numberList) {
        //parsing String numbers into int variables
                 int   scannedInt = Integer.parseInt(t);
        //giving the int numbers to the new int array scannedArray
                 scannedArray[i] = scannedInt;
        //our counter loops to the next element - ensures that we get
        // put all the elements from the original array to the new int array
                 i++;
                    }

       //we return the new int array
        return scannedArray;
    }

    public static String scanner() {
        Scanner scanner1 = new Scanner(System.in);
        String scannedNumber = scanner1.nextLine();
        return scannedNumber;
    }


    public static void findMin(int[] scannedArray) {
        Arrays.sort(scannedArray);
        // after sorting the array, ascending order
        // the first element is the minimum
       System.out.println(scannedArray[0]);


    }
}



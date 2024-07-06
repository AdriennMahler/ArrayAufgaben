import java.util.Arrays;

public class SortingArrays {
    /*
    Create a program using arrays that sorts a list of integers in descending order.
    Descending order is highest value to lowest.
    In other words if the array had the values in it
    [106, 26, 81, 5, 15] your program should ultimately
    have an array with [106, 81, 26, 15, 5] in it.

    Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
    Implement the following methods:

    getIntegers has one parameter of type int which is
    the size of the array.
    It returns an array of entered integers from the keyboard.

    printArray accepts an array and prints out
    the contents of the array. It should be printed in the following format:

    Element 0 contents 106
    Element 1 contents 81
    Element 2 contents 26
    Element 3 contents 15
    Element 4 contents 5

    sortIntegers accepts the unsorted array.
    It should sort the array and return a new array containing the sorted numbers.
     */

    public static void main(String[] args) {
        int[] testArray={1, 5, 18, 23, 74, 24};
        printArray(testArray);
        int[] test=sortInteger(testArray);
        System.out.println(Arrays.toString(test));
    }

    public static int[] getInteger(int length){
        int[] scanArray = new int[length];
        return scanArray;
    }

    public static void printArray(int[] print){
        for(int i=0; i<print.length; i++){
            System.out.println("Element " + i + " contents " + print[i]);
        }
    }

    public static int[] sortInteger(int[] unsorted){
       int[] sorted = new int[unsorted.length];
        Arrays.sort(unsorted);
        for(int i = 0; i < unsorted.length; i++) {
            int j = unsorted[i];
            sorted[i] = unsorted[unsorted.length - i -1];
            unsorted[unsorted.length - i - 1] = j;
        }  System.out.println(Arrays.toString(sorted));
        return sorted;
    }
}

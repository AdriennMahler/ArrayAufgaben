import java.util.Arrays;
import java.util.Random;

public class ArrayBasics {

    public static void main(String[] args) {
        //calling random array method
        int[] firstArray = randomArray(10);
        System.out.println(Arrays.toString(firstArray));
        //sorting result
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10]; // fills with default 0
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5); //fills with 5
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = randomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // copy of an array creates a new array, an instance of an array
        // objects: objects reference is copied

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); //copy of third random array
        System.out.println(Arrays.toString(thirdArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        //we can get the copy of an array with less elements
        System.out.println(Arrays.toString(smallerArray));
        // wtih larger number of elements then the original array - it fills with 0s

        //Search array elements -binary search
        String[] k = {"Anna", "Peter", "Klara"};
        Arrays.sort(k);                 //first SORT!!!!
        if(Arrays.binarySearch(k, "Klara")>0){
            System.out.println("I have found Klara!!");
        }

        //Comparing if arrays are equal
        int[] i1= {1 ,2 ,3 , 4, 5};
        int[] i2= {1 ,2 ,3 , 4, 5};

        if(Arrays.equals(i1, i2)){
            System.out.println("The two arrays are equal");
        }else{
            System.out.println("The two arrays are not equal");
        }
    }

    //Basic int Array

    /*
        Array is not resizable
        Array is a class
        Inherits from java.lang.Object
     */

    // Creating an array

    int[] integerArray = new int[10]; //SIZE!!!!



    //The array initializer as an anonymus array

    int[] intNumbers = {1, 2,3,4,5};
    String[] names= {"Johanna", "Jonathan", "Benedict", "Matthias", "Joachim"};
    //can only be used in a declaration statement


    //for loop
/*
    int[] newArray;
    newArray = new int[] {5,4,3,2,1};
    for(int i=0; i<newArray.length; i++){
        System.out.println(newArray[i] + " ");
    }
    */
//creating new array elements with for loop
public static void arrayCreate() {

    int[] loopArray;
    loopArray = new int[5];
    for (int i = 0; i < loopArray.length; i++) {

        System.out.println(loopArray[i]); // [0, 0, 0, 0, 0]
        // without array initializer statement all array elements
        // get initialized to the default value of that type
        // numeric: 0
        // boolean: false
        // class: null
    }
    for (int i = 0; i < loopArray.length; i++) {
        loopArray[i] = loopArray.length - 1; //[5, 4, 3, 2, 1,]
    }
//Enhanced for loop,  for each loop
    // for(declaration expression with type : array element){}

    for(int element : loopArray){
        System.out.print(element + " ");
    }
// print out
    System.out.println(Arrays.toString(loopArray));
    }

    //------------OBJECT ARRAY

    public static void objactArray() {
        Object[] objectArray = new Object[3];
        objectArray[0] = "hi";
        objectArray[1]= new StringBuilder("World");
     //   objectArray[2]= loopArray; ---nested Array
    }

    //adding random numbers to an array with exclusive upper limit 100
    private static int[] randomArray(int leng){
        Random random = new Random();
        int[] newInt = new int[leng];
        for(int i=0; i<leng; i++){
            newInt[i] = random.nextInt(100); //[0...100)
        }
        return newInt;
    }
}

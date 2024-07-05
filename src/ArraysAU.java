import java.util.Arrays;
import java.util.Random;

public class ArraysAU {


    public static void main(String[] args) {

        int[] arr = createArray(2, 5, 30);  //A1
        umlaute();                                           //A3
        deutschBuchstaben();                                 //A4
        math();                                              //A5

        //-------Test A6-------------------------------------------//
      /*  int[] a1 = { 1, 2, 3 };
        int[] a2 = { 12, 13, 14 };

        int[] a3 = add(a1, a2);
      */
        //-------Test A7-------------------------------------------//

        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 12, 13, 14 };

        int[] a3 = join(a1, a2); //000??
    }

     /*
    ######A1.

    Definieren Sie eine Methode 'createArray', die ein in-Array erzeugt und
    mit Zufallswerten belegt.
    Die neue Methode soll aus der main-Methode
    aufgerfufen werden koennen:
    int[] arr = createArray(2, 15, 30);

    In diesem Beispiel wird ein Array der Länge 30 erzeugt
    und mit den Zufallswerten aus dem Bereich [2...15] belegt.
     */



    public static int[] createArray(int min, int max, int length) {
        int[] a = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            int k = rand.nextInt(max - min + 1) + min;
            a[i] = k;
        }
        printArray(a);
        return a;
    }
//-------------------------------------------------------------------------------------------------//
    /*
    #########A2

    Bitte geben Sie das A1 erzeugte Array aus.
    Dafür definieren Sie eine weitere Methode 'printArray',
    an die Sie das Array übergeben.
     */

    public static void printArray(int[] arr) {
        String arrAsText = Arrays.toString(arr);
        System.out.println(arrAsText);

    }
    //-------------------------------------------------------------------------------------------------//
    /*
    #########A3.

    Definieren Sie eine statische Methode deutsche Umlaute,
    die ein Array mit den Zeichen 'ä', 'ö' und 'ü' zurück liefert. Testen Sie die Methode.
    */
    public static char[] umlaute() {
        char[] c = {'ä', 'ö', 'ü'};
        System.out.println(c[0]); //Test 1. Element auf die Konsole schreiben
        return c;
    }
    //-------------------------------------------------------------------------------------------------//
    /*
    #########A4.
    Definieren Sie eine statische Methode deutscheBuchstaben,
    die ein Array mit allen deutschen Kleinbuchstaben
    inklusive Umlaute und 'ß' zurück liefert. Testen Sie die Methode.
     */

    public static char[] deutschBuchstaben() {
        //Char Arrays für die Buchstaben
        char[] b= new char[]{'ß'};
        char[] c = new char[26];
        char[] a =new char[] {'ä', 'ö', 'ü'};

        //For loop für unicode Zahlen definieren die klein Buchstaben plus indexieren das Array
        for (char i = 0; i <26; i++) {
            c[i]= (char)('a' +i);
        }

        //Concatenate 3 Arrays mit StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append(c);
        sb.append(a);
        sb.append(b);

        char result[]= sb.toString().toCharArray();

        printArray(result);

        return result;
    }

// char Array print Methode
    public static void printArray(char[] arr){
        String arrAsText = Arrays.toString(arr);
        System.out.println(arrAsText);
    }
//-------------------------------------------------------------------------------------------------//
    /*
    #######A5
    Erzeugen Sie bitte ein Array in dem die Konstanten
    Math.PI und Math.E gespeichert werden. Geben Sie dann das Array aus.
     */
    public static void math() {
        double[] math = new double[]{Math.PI, Math.E};

        String arrAsText = Arrays.toString(math);
        System.out.println(arrAsText);
    }
    //-------------------------------------------------------------------------------------------------//
     /*
    #######A6
    Gegeben sind folgende zwei Arrays:

    int[] a1 = { 1, 2, 3 };
    int[] a2 = { 12, 13, 14 };

    und folgender Methodenaufruf:

    int[] a3 = add(a1, a2); // a3 bekommt folgende Werte: 13, 15, 17

    Diefinieren Sie bitte die Methode add so,
    dass sie die ensprechenden Elemente der beiden
    übergebenen Arrays addiert und in einem neuen
    Array zurück liefert. Testen Sie die Methode.


     */

    public static int[] add(int[] a1, int[] a2){
        int[] a3= new int[a1.length];
        for(int i=0; i<a1.length; i++){
            a3[i]=a1[i]+a2[i];
        }
        printArray(a3);
        return a3;
        }
//-------------------------------------------------------------------------------------------------//

    /*
    ############## A7.
    Gegeben sind folgende zwei Arrays:

        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 12, 13, 14 };
    und folgender Methodenaufruf:

    int[] a3 = join(a1, a2); // a3 bekommt folgende Werte: 1, 2, 3, 12, 13, 14

    Definieren Sie bitte die Methode join so,
    dass sie ein neues Array liefert in dem
    die Elemente der beiden übergebenen Arrays erhalten sind.
    Testen Sie die Methode.
 */

    public static int[] join(int[] a1, int[] a2){
        int a1Length= a1.length;
        int a2Length= a2.length;
        int bLength= a1Length*a2Length;
        int[] b= new int[bLength];

        System.arraycopy(a1, 0, b, 0, a1Length);
        System.arraycopy(a2, 0, b, a1Length, a2Length);

        printArray(b);
        return b;
    }

}
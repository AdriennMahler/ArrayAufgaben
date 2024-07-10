public class VarargsAufgaben {
    public static void main(String[] args) {
        int x = 0;
        x = produkt(new int[]{});                   //A1
        String y = "";
        y = concat(new String[]{});                 //A2
        y = concat(", ", new String[]{});  //A3
    }
    /*
    A1
    Definieren Sie eine Methode produkt, die 'beliebig viele'
    übergebene int-Werte untereinander multipliziert
    und das Ergebnis zurück liefert. Sie dürfen das mögliche
    'int overflow' bei dieser Aufgabe ignorieren.
    Falls keine Argumente übergeben werden, soll die Methode 0 zurück liefern.
 */
    static int produkt(int... arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 1;
        for (int x : arr) {
            sum *= x;
        }
        return sum;
    }
//------------------------------------------------------------------------------
/*
    A2
    Definieren Sie eine Methode concat,
    die 'beliebig viele' übergebene Strings
    zu einem Gesamtstring konkateniert und ihn dann zurück liefert.
 */

    static String concat(String... arr) {
        String newString = "";
        for (String y : arr) {
            newString += y;
        }
        return newString;
    }
    //------------------------------------------------------------------------------
    /*
    A3
    Überladen Sie die Methode concat, die 'beliebig viele'
    übergebene Strings zu einem Gesamtstring konkateniert
    und ihn dann zurück liefert. Die neue Methode bekommt
    zusätzlich als Argument den String 'delimeter',
    der im Gesamtstrings zwischen den einzelnen konkatenierten
    Unterstrings steht. Z.B. wird die neue Methode die Strings
    "mo", "di" und "mi" mit dem delimeter ", "
    zu dem String "mo, di, mi" konkatenieren.
 */

    static String concat(String delimeter, String... arr) {
        String stringMitComma = "";
            for (int i = 0; i <arr.length; i++) {
                stringMitComma+=arr[i];

                if (i < arr.length-1) {
                    stringMitComma+=delimeter;
                }
            }
        return stringMitComma;
        }
    }


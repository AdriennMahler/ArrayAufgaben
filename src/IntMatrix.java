import java.util.Random;

/*
Erstellen Sie eine Klasse 'IntMatrix',
die eine Matrix von int-Elementen definiert.
Beim Testen in einer main-Methode sollen folgende
Aufgaben mit Hilfe der Klasse 'IntMatrix' gelöst werden:
-----------------------------------------------------------------------
Erstellt eine IntMatrix mit 2 Zeilen und 3 Spalten:

IntMatrix m1 = new IntMatrix(2, 3);
-----------------------------------------------------------------------
Erstellt eine IntMatrix mit 5 Zeilen und 3 Spalten.
Alle Elemente der IntMatrix sind mit dem Wert 100 initialisiert:

IntMatrix m2 = new IntMatrix(5, 3, 100);
------------------------------------------------------------------------
System.out.println(m1) gibt auf der Konsole die IntMatrix m1 in folgender Form aus:

0, 0, 0
0, 0, 0
------------------------------------------------------------------------
Liefert den Wert an der Stelle (1, 2) der IntMatrix (Zeile 1, Spalte 2):

int i = m1.get(1, 2);
-----------------------------------------------------------------------
Erstellt eine IntMatrix mit 4 Zeilen und 6 Spalten.
Alle Elemente werden zufällig initialisiert.
Der erlaubte Wertebereich für die Elemente: 0 bis 200:

IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);
-----------------------------------------------------------------------
Liefert true, falls die Matrizen die gleichen Werte an den entsprechenden
Stellen gespeichert haben. Die Matrizen mit ungleichen Dimensionen sind ungleich:

m1.equals(m2);

-----------------------------------------------------------------------
 */
    public class IntMatrix {
    int[][] m1;


    //--------------------------------------------------------------------------
    /*
    Erstellt eine IntMatrix mit 2 Zeilen und 3 Spalten:
    */
    public IntMatrix(int a, int b) {
        m1 = new int[a][b];
        //--------------------------------------------------------------------------
    /*
    System.out.println(m1) gibt auf der Konsole die IntMatrix m1 in folgender Form aus:
        0, 0, 0
        0, 0, 0
     */


        for (int k = 0; k < m1.length; k++) {
            for (int l = 0; l < m1[k].length; l++) {
                System.out.print(m1[k][l]);
                if(l<m1[k].length-1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    //--------------------------------------------------------------------------
    /*
    Liefert den Wert an der Stelle (1, 2) der IntMatrix (Zeile 1, Spalte 2):
    */
    public int get(int a, int b) {
        return m1[a][b];
    }

    //--------------------------------------------------------------------------
    /*
    Erstellt eine IntMatrix mit 5 Zeilen und 3 Spalten.
    Alle Elemente der IntMatrix sind mit dem Wert 100 initialisiert:
     */
   public IntMatrix(int a, int b, int c) {
        m1 = new int[a][b];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
               System.out.print( m1[i][j] = c);
            }
            System.out.println();
        }
    }
    /*
    -----------------------------------------------------------------------
    Erstellt eine IntMatrix mit 4 Zeilen und 6 Spalten.
    Alle Elemente werden zufällig initialisiert.
    Der erlaubte Wertebereich für die Elemente: 0 bis 200:

     */
    public static IntMatrix getRandomMatrix(int a, int b, int c){
        IntMatrix m1 = new IntMatrix(a,b);
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m1.m1[i][j] = random.nextInt(c - min + 1) + min;
                System.out.print( m1.m1[i][j] +" ");
            }
            System.out.println();
        }
        return m1;
    }
    //--------------------------------------------------------------------------
    /*
    Liefert true, falls die Matrizen die gleichen Werte an den entsprechenden
    Stellen gespeichert haben. Die Matrizen mit ungleichen Dimensionen sind ungleich:

            m1.equals(m2);
     */
    public boolean equals(int[][] m2){
        if(m1.length !=m2.length)
            return false;
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[i].length; j++){
                if(m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }

    //--------------------------------------------------------------------------

    public static void main(String[] args) {
       IntMatrix m1 = new IntMatrix(2, 3);
        System.out.println( m1.get(1, 2));
     IntMatrix m2 = new IntMatrix(5, 3, 100);
       IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);
       System.out.println( m1.equals(m2));
    }


}
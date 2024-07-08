public class Arrays2D
{
    public static void main(String[] args) {
        int[][] arr = createArray(4, 5);
        printArray(arr);

        int[][] arr2 = createArray2(4, 5);
        printArray(arr2);

        int[][] arr3 = createArray3(4, 5);
        printArray(arr3);

        int[][] arr4 = createArray4(4, 5, 2);
        printArray(arr4);

    }
 /* #######A1
 Bitte definieren Sie eine Methode createArray,
 die ein zweideminseonales int-Array erzeugt.
 Die neue Methode soll aus der main-Methode
 folgendermassen aufgerufen werden koennen:

    int[][] arr = createArray(4, 5);
  */
    public static int[][] createArray(int a, int b){
     int[][] arr =new int[a][b];
     return arr;
 }
 //--------------------------------------------------------
 /* #######A2.
    Bitte geben Sie das erzeugte Array aus.
    Dafür definieren Sie eine weitere Methode printArray,
    an die Sie das Array übergeben.
    Für das Array aus dem Beispiel soll die Konsolenausgabe so aussehen:

    0 0 0 0 0
    0 0 0 0 0
    0 0 0 0 0
    0 0 0 0 0
   */

    public static void printArray(int[][] c){

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    //--------------------------------------------------------
    /* #######A3.
    Speichern Sie in dem Array auf der Stelle (1,1)
    den Wert 5 und geben Sie das Array erneut auf dem Bildschirm aus.
    */
    public static int[][] createArray2(int a, int b){
        int[][] arr =new int[a][b];
        arr [1][1]=5;
        return arr;
    }

    //--------------------------------------------------------
    /* #######A4.
    Belegen Sie alle Positionen in dem Array mit dem Wert 2.
    Benutzen Sie dazu die verschachtelten for-Schleifen.
    */
    public static int[][] createArray3(int a, int b) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 2;
            }
        }
        return arr;
    }

    //--------------------------------------------------------
    /* #######A5.
    Bitte überladen Sie die Methode createArray durch eine weitere Methode,
    die ein zweideminseonales int-Array erzeugt und mit dem gewünschten Wert belegt.
    Die neue Methode soll aus der main-Methode folgendermassen aufgerufen werden koennen:

    int[][] arr = createArray(4, 5, 2);
    */
    public static int[][] createArray4(int a, int b, int c) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = c;
            }
        }
        return arr;
    }
}

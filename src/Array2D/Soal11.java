package Array2D;

import java.util.Scanner;

public class Soal11 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int countData = 0;
        String simbol = "*";

        String[][] result = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-(i+1)); j++) {
                result[i][countData] = " ";
                countData += 1;
            }
            for (int k = 0; k < (i+1); k++) {
                result[i][countData] = simbol;
                countData += 1;
            }
            countData = 0;
        }
        Utility.printArray2DString(result);
    }
}

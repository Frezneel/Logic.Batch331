package Array2D;

import java.util.Scanner;

public class Soal06 {
    public static void resolve(){ // PR
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int baris = 3;
        int awalData = 1;

        int[][] result = new int[baris][n];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    result[i][j] = j;
                }
                if (i == 1){
                    result[i][j] = awalData;
                    awalData *= result[0][(n-1)] + i;
                }
                if (i == 2){
                    awalData = result[i-1][j] + j;
                    result[i][j] = awalData;
                }
            }
            awalData = 1;
        }
        Utility.printArray2D(result);
    }
}

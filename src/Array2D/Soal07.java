package Array2D;

import java.util.Scanner;

public class Soal07 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int data = 0;
        int baris = 3;

        int[][] result = new int[baris][n];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < n; j++) {
                if (data % 3 == 0){
                    data *= -1;
                    result[i][j] = data;
                    data *= -1;
                    data += 1;
                }else {
                    result[i][j] = data;
                    data += 1;
                }
            }
        }
        Utility.printArray2D(result);
    }
}

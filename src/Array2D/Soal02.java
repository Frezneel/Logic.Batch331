package Array2D;

import java.util.Scanner;

public class Soal02 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int lompat = 1;

        int[][] result = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    result[i][j] = j;
                }
                if (i == 1){
                    if((j+1) % 3 == 0){ //
                        lompat *= -1;
                        result[i][j] = lompat;
                        lompat *= -3;
                    }else {
                        result[i][j] = lompat; //DImasukkan dulu
                        lompat *= 3; // Dikalikan 3
                    }
                }
            }
        }
        Utility.printArray2D(result);
    }
}

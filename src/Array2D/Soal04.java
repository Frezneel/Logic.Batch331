package Array2D;

import java.util.Scanner;

public class Soal04 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int lompat1 = 1;
        int lompat2 = 5;

        int[][] result = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    result[i][j] = j;
                }
                if (i == 1){
                    if(( j + 1 ) % 2 != 0){
                        result[i][j] = lompat1;
                        lompat1 ++;
                    }else{
                        result[i][j] = lompat2;
                        lompat2 += 5;
                    }
                }
            }
        }
        Utility.printArray2D(result);
    }
}

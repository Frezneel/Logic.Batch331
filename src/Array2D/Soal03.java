package Array2D;

import java.util.Scanner;

public class Soal03 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int lompat = 3;
        boolean tengah = n % 2 == 0 ? false : true;
        int puncak = 0; //Kalau puncak genap = 0, kalau ganjil puncak = 1 (Tidak jadi)

        int[][] result = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    result[i][j] = j;
                }
                if (i == 1){

                    if (tengah){
                        System.out.println("Tengah");
                        if((j+1) > n/2){
                            result[i][j] = lompat;
                            lompat /= 2;
                        }else{
                            result[i][j] = lompat;
                            lompat *= 2;
                        }
                    }else {
                        System.out.println("Dobule Tengah");
                        if((j+1) > n/2){
                            result[i][j] = lompat;
                            lompat /= 2;
                        } else if ((j) == (n/2) + 1 || (j) == (n/2) - 1) {
                            result[i][j] = lompat;
                        } else{
                            result[i][j] = lompat;
                            lompat *= 2;
                        }
                    }
                }
            }
        }
        Utility.printArray2D(result);
    }
}

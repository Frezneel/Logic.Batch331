package Array2D;

import java.util.Scanner;

public class Soal12 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Colom (n) = ");
        int n = input.nextInt();
        int count = 0;
        boolean tengah = n%2 == 0 ? false : true;
        int nilaiTengah = n%2 == 0 ? n/2 : (n/2 + 1);
        int nilaiTengahGenap = (n/2) + 1;
        String simbol = "*";

        String[][] result = new String[nilaiTengah][n];

        if (tengah){
            for (int i = 0; i < nilaiTengah; i++) {
                for (int j = 0; j < ((n/2) - i); j++) {
                    result[i][count] = " ";
                    count ++;
                }
                for (int k = 0; k <= 2 * i ; k++) {
                    if (k % 2 == 0) {
                        result[i][count] = "0";
                        count ++;
                    }
                    else {
                        result[i][count] = "1";
                        count ++;
                    }
                }
                for (int k = 0; k < ((n/2) - i) ; k++) {
                    result[i][count] = " ";
                    count ++;
                }
                count = 0 ;
            }
        }else {
            for (int i = 0; i < nilaiTengah; i++) {
                for (int j = 0; j < (n/2) - (i+1); j++) {
                    result[i][count] = " ";
                    count ++;
                }
                for (int k = 0; k <= i*2 ; k++) {
                    if (k % 2 == 0) {
                        result[i][count] = "0";
                        count += 1;
                        if (count == ((n/2))){
                            result[i][count] = "0";
                            count++;
                        }

                    }
                    else {
                        result[i][count] = "1";
                        count ++;
                        if (count == ((n/2))){
                            result[i][count] = "1";
                            count += 1;
                        }
                    }
                }

                for (int k = 0; k < ((n/2)-1) - (i) ; k++) {
                    result[i][count] = " ";
                    count ++;
                }
                count = 0 ;
            }
        }
        Utility.printArray2DString(result);
    }
}

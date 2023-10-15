package InputPlural;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal10 {
    public static void resolve(){
        System.out.println("==== Apakah Bilangan Perima? ====");
        System.out.println("Masukkan Deret Angka : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);

        String inputNilai = input.nextLine();

        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        int panjang = nilai.length;
        int count = 0;
        String prima = "";

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < nilai[i] + 1; j++) {
                if (nilai[i] % (j+1) == 0){
                    count++;
                }
            }
            if (count == 2 ){
                prima += nilai[i] + " ";
            }
            count = 0;
        }

        System.out.println("Output = " + prima + "Adalah bilangan prima");
        Utility.mauLagi();
    }
}

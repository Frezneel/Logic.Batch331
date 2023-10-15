package InputPlural;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal09 {
    public static void resolve(){
        System.out.println("==== Menentukan banyaknya Persentase angka yang Positif, Negatif, dan zero(0) ====");
        System.out.println("Masukkan Deret Angka : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);

        String inputNilai = input.nextLine();

        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        int panjang = nilai.length;
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int i = 0; i < panjang; i++) {
            if (nilai[i] < 0){
                negative++;
            }
            if (nilai[i] == 0){
                zero++;
            }if (nilai[i] > 0){
                positive++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.0");
        negative = (negative/panjang) * 100;
        positive = (positive/panjang) * 100;
        zero = (zero/panjang) * 100;

        System.out.println("Positive = " + df.format(positive) + " %");
        System.out.println("Negative = " + df.format(negative) + " %");
        System.out.println("Zero = " + df.format(zero) + " %");

        Utility.mauLagi();
    }
}

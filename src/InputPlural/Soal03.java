package InputPlural;

import java.util.Scanner;

public class Soal03 {
    // Mencari Median (bilangan tengah)
    public static void resolve(){
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("==== Median/Bilangan Tengah ====");
            System.out.println("Masukkan Deret Angka : ");
            System.out.println("Contoh : 1 2 3 4 5");
            System.out.println("Masukkan : ");
            String angka = input.nextLine();
            if (Utility.isNumber(angka)){
                int[] nilai = Utility.ConvertStringToArrayInt(angka);
                int panjang = nilai.length;
                int tengah = panjang/2;
                // Mendeklarasikan nilai jika panjang dibagi 2 sisa 0 berarti bernilai true jika bersisa bernilai false
                boolean genap = panjang % 2 == 0 ? true : false;
                double median;

                if (genap){
                    median = (double) (nilai[tengah-1] + nilai[tengah]) / 2;
                }else {
                    median = nilai[tengah];
                }

                System.out.println("Nilai Median = " + median);
                flag = false;
            }
        }
        Utility.mauLagi();
    }
}

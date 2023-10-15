package InputPlural;

import java.util.Scanner;

public class Soal01 {
    // Menjumlahkan semua angka input
    public static void resolve(){
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("==== Menjumlahkan ====");
            System.out.println("Masukkan Deret Angka : ");
            System.out.println("Contoh : 1 2 3 4 5");
            System.out.println("Masukkan : ");
            String angka = input.nextLine();
            if (Utility.isNumber(angka)){
                int[] nilai = Utility.ConvertStringToArrayInt(angka);
                int panjang = nilai.length;
                int jumlah = 0;

                for (int i = 0; i < panjang; i++) {
                    jumlah += nilai[i];
                }
                System.out.println("Jumlah angka = "+jumlah);
                flag = false;
            }
        }
        Utility.mauLagi();
    }
}

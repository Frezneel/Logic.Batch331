package InputPlural;

import java.util.Scanner;

public class Soal02 {
    // Mencari rata-rata
    public static void resolve(){
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("==== Rata-Rata ====");
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
                double rata2 = (double) jumlah / panjang;
                System.out.println("Rata-rata = "+ jumlah + " / " + panjang);
                System.out.println("Nilai rata-rata = " + rata2);
                flag = false;
            }
        }

    }
}

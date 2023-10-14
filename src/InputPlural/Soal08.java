package InputPlural;

import java.util.Scanner;

public class Soal08 {
    public static void resolve(){
        System.out.println("==== Mengurutkan Terkeci ke terbesar ====");
        System.out.println("Masukkan Deret Angka : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);

        String inputNilai = input.nextLine();

        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        int panjang = nilai.length;
        int nilaiTerbesar = 0;
        int banyakTerbesar = 0;

        for (int i = 0; i < panjang; i++) {
            if (nilaiTerbesar < nilai[i]){
                nilaiTerbesar = nilai[i];
            }
        }
        for (int i = 0; i <panjang ; i++) {
            if (nilaiTerbesar == nilai[i]){
                banyakTerbesar ++;
            }
        }

        System.out.print("Angka terbesar keluar sebanyak = " + banyakTerbesar);

    }

}

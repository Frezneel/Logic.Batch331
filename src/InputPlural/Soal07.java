package InputPlural;

import java.util.Scanner;

public class Soal07 {
    public static void resolve(){
        System.out.println("==== Mengurutkan Terkecil ke terbesar ====");
        System.out.println("Masukkan Deret Angka : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);

        String inputNilai = input.nextLine();

        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        int panjang = nilai.length;
        int terbesar = 0;
        int nilaiTerbesar = 0;
        int terkecil = 0;
        int nilaiTerkecil = 0;

        //Mengambil nilai terbesar dan terkecil pada Input
        for (int i = 0; i < panjang; i++) {
            if (i == 0){
                terbesar = nilai[0];
                terkecil = nilai[0];
            }else {
                if (terbesar < nilai[i]){
                    terbesar = nilai[i];
                }
                if (terkecil > nilai[i]){
                    terkecil = nilai[i];
                }
            }
        }

        //Mencari total nilai terbesar dan terkecil untuk n-1
        for (int i = 0; i < panjang; i++) {
            if (nilai[i] < terbesar){
                nilaiTerkecil += nilai[i];
            }
            if (nilai[i] > terkecil){
                nilaiTerbesar += nilai[i];
            }
        }

        System.out.print("Nilai Terbesar = " + nilaiTerbesar);
        System.out.println();
        System.out.print("Nilai Terkecil = " + nilaiTerkecil);

        Utility.mauLagi();
    }
}

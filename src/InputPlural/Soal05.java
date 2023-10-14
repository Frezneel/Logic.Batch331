package InputPlural;

import java.util.Scanner;

public class Soal05 {
    // Urutan deret tanpa fugnsi sort
    public static void resolve(){
        System.out.println("==== Mengurutkan Terkeci ke terbesar ====");
        System.out.println("Masukkan Deret Angka : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);

        String inputNilai = input.nextLine();

        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        int panjang = nilai.length;
        int counter = 0;
        int[] urut = new int[panjang];

        for (int i = 0; i < panjang ; i++) {
            for (int j = 0; j < panjang; j++) {
                if (nilai[i] != nilai[j]){
                    if (nilai[i] > nilai[j]){
                        counter++;
                    }
                }
            }
            urut[i] = counter;
            counter = 0;
        }
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                if (i == urut[j]){
                    System.out.print(nilai[j] + " ");
                }
            }
        }

    }
}

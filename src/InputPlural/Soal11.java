package InputPlural;

import java.util.Scanner;

public class Soal11 {
    public static void resolve(){
        System.out.println("==== Urutkan Alphabet Ascending dan Descending ====");
        System.out.println("Masukkan Deret Huruf : ");
        System.out.println("Contoh : A B C D E");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);
        String inputNilai = input.nextLine();
        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        System.out.println("Urutkan secara : ");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        String inputNilai2 = input.nextLine();

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

    }
}

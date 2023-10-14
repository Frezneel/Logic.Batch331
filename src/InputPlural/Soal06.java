package InputPlural;

import java.util.Scanner;

public class Soal06 {
    public static void resolve(){
        System.out.println("==== Mencari banyak pasangan angka ====");
        System.out.println("Masukkan Deret Angka : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);

        String inputNilai = input.nextLine();

        int[] nilai = Utility.ConvertStringToArrayInt(inputNilai);
        int panjang = nilai.length;
        int counter = 0;
        int[] banyaknya = new int[panjang];
        boolean isSame = false;

        for (int i = 0; i <panjang ; i++) {
            if (i == 0){
                for (int j = 0; j < panjang; j++) {
                    if (nilai[i] == nilai[j]){
                        counter++;
                    }
                }
            }else {
                isSame = false;
                for (int j = 0; j < i; j++) {
                    if (nilai[i] == nilai[j]){
                        isSame = true;
                    }
                }
                if (isSame){
                    counter = 0;
                }else {
                    for (int j = 0; j <panjang ; j++) {
                        if (nilai[i] == nilai[j]){
                            counter ++;
                        }
                    }
                }
            }
            banyaknya[i] = counter;
            System.out.print(counter + " ");
            counter = 0;
        }
        System.out.println();
        int output = 0;
        for (int i = 0; i < panjang; i++) {
            output += banyaknya[i]/2;
        }

        System.out.println("Banyaknya pasangan pada bilangan angka tersebut = " + output);

    }
}

package InputPlural;

import java.util.Scanner;

public class Soal11 {
    // digunakan untuk membandingkan urutan huruf
    private final static String[] HURUF =
            {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                    "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void resolve(){
        System.out.println("==== Urutkan Alphabet Ascending dan Descending ====");
        System.out.println("Masukkan Deret Huruf : ");
        System.out.println("Contoh : A B C D E");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);
        String inputNilai = input.nextLine();
        String[] nilai = Utility.ConvertStringToArrayString(inputNilai.toLowerCase());
        int panjang = nilai.length;
        String output = "";
        boolean flag = true;

        while (flag){
            System.out.println("Urutkan secara : ");
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            String inputNilai2 = input.nextLine();
            if (inputNilai2.length() < 2 && !inputNilai2.isEmpty()){
                if (Utility.isNumber(inputNilai2)){
                    if (inputNilai2.equals("1")){
                        output = urutAscending(nilai);
                    }else if(inputNilai2.equals("2")){
                        output = urutDescending(nilai);
                    }
                    flag = false;
                }
            }
        }

        System.out.println("Output = " + output);
        Utility.mauLagi();
    }

    private static String urutAscending(String[] nilai){
        String nilaiUrut = "";
        int panjangChar = HURUF.length;
        int panjangInput = nilai.length;
        int counter = 0;

        for (int i = 0; i < panjangChar; i++) {
            for (int j = 0; j < panjangInput; j++) {
                if (HURUF[i].equals( nilai[j]) ){
                    nilaiUrut += HURUF[i] + " ";
                    counter++;
                }
            }
            if (counter == panjangInput){
                break;
            }
        }

        return nilaiUrut;
    }

    private static String urutDescending(String[] nilai) {
        String nilaiUrut = "";
        int panjangChar = HURUF.length;
        int panjangInput = nilai.length;
        int counter = 0;

        for (int i = 0; i < panjangChar; i++) {
            for (int j = 0; j < panjangInput; j++) {
                if (HURUF[panjangChar - (i+1)].equals( nilai[j]) ){
                    nilaiUrut += HURUF[panjangChar - (i+1)] + " ";
                    counter++;
                }
            }
            if (counter == panjangInput){
                break;
            }
        }

        return nilaiUrut;
    }
}

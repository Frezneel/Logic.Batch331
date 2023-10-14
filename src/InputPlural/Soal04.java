package InputPlural;

import java.util.Scanner;

public class Soal04 {
    // Mencari Modus (bilangan yang banyak keluar)
    public static void resolve(){
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("==== Modus/Bilangan terbanyak muncul ====");
            System.out.println("Masukkan Deret Angka : ");
            System.out.println("Contoh : 1 2 3 4 5");
            System.out.println("Masukkan : ");
            String angka = input.nextLine();
            if (Utility.isNumber(angka)) {
                int[] nilai = Utility.ConvertStringToArrayInt(angka);
                int panjang = nilai.length;
                int tampung = 0;
                int hitung = 0;
                int terbanyak = 0;
                // digunakan untuk menampun banyaknya angka yang keluar
                int[] banyakNilai = new int[panjang];
                // Pada for ini berfungsi untuk menghitung banyaknya angka yang keluar
                for (int i = 0; i < panjang; i++) {
                    if (i == 0){
                        tampung = nilai[i];
                        for (int j = 0; j < panjang; j++) {
                            if (tampung == nilai[j]){
                               hitung ++;
                            }
                        }
                        banyakNilai[i] = hitung;
                        terbanyak = tampung;
                    }
                    else {
                        boolean isSame = false;
                        // Mengecek kondisi sebelumnya apakah ada yang sama? agar tidak di hitung lagi banyaknya karena sudah diwakilkan
                        for (int j = 0; j < i; j++) {
                            if (nilai[i] == nilai[j]){
                                isSame = true;
                            }
                        }
                        if (!isSame){
                            for (int k = 0; k < panjang; k++) {
                                if (nilai[i] == nilai[k]){
                                    hitung ++;
                                }
                            }
                            banyakNilai[i] = hitung;
                        }
                        // yang nilainya sama dari panjang sebelumnya dibikin 0 agar lebih mudah membandingkan banyaknya nilai kemudian mengambil data tersebut
                        // dan agar ketik di printout tidak double
                        else {
                            banyakNilai[i] = 0;
                        }
                    }
                    hitung = 0;
                }
                System.out.print("cek Hitung Data = ");
                int palingBanyak = 0;
                String Output = "";
                // Pada for ini berfungsi untuk meyimpulkan data yang paling banyak keluar
                for (int i = 0; i < panjang; i++) {
                    if (palingBanyak == banyakNilai[i]){
                        Output += nilai[i] + " ";
                    }
                    if (palingBanyak < banyakNilai[i]){
                        palingBanyak = banyakNilai[i];
                        Output = nilai[i] + " ";
                    }

                    System.out.print(banyakNilai[i] + " ");
                }
                System.out.println();
                System.out.println("Banyak data = " + Output);
                flag = false;
            }
        }
    }
}

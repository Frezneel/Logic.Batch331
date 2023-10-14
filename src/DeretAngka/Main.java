package DeretAngka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== MENU =====");
        System.out.println("Masukkan nomor soal dari 1 - 12");
        int pilihan = input.nextInt();
        while (pilihan < 1 || pilihan > 12){
            System.out.println("Pilihan tidak sesuai, Pastikan sesuai dengan Menu!");
            System.out.println("Pilihan : ");
            pilihan = input.nextInt();
        }

        System.out.print("Masukkan Nilai n = ");
        int n = input.nextInt();

        switch (pilihan){
            case 1 :
                Soal01.resolve(n);
                break;
            case 2 :
                Soal02.resolve(n);
                break;
            case 3 :
                Soal03.resolve(n);
                break;
            case 4 :
                Soal04.resolve(n);
                break;
            case 5 :
                Soal05.resolve(n);
                break;
            case 6 :
                Soal06.resolve(n);
                break;
            case 7 :
                Soal07.resolve(n);
                break;
            case 8 :
                Soal08.resolve(n);
                break;
            case 9 :
                Soal09.resolve(n);
                break;
            case 10 :
                Soal10.resolve(n);
                break;
            case 11 :
                Soal11.resolve(n);
                break;
            case 12 :
                Soal12.resolve(n);
                break;
            default:

        }

    }
}

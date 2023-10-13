package InputPlural;

import DeretAngka.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== MENU =====");
        System.out.println("Masukkan nomor soal dari 1 - 12");
        int pilihan = input.nextInt();
        while (pilihan < 0 || pilihan > 12){
            System.out.println("Pilihan tidak sesuai, Pastikan sesuai dengan Menu!");
            System.out.println("Pilihan : ");
            pilihan = input.nextInt();
        }

        switch (pilihan){
            case 0 :
                Example.Reslove();
                break;
            default:

        }
    }
}

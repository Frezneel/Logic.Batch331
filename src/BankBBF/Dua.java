package BankBBF;

import java.util.Scanner;

public class Dua {
    private static Scanner input = new Scanner(System.in);
    //Memberi kondisi pertama kali pada flag = true;
    private static boolean flag = true;

    public static void cekPIN (){
        System.out.println("=================================");
        System.out.println("Silakan login untuk melanjutkan transaksi");
        int countSalah = 0;
        flag = true;
        while (flag) {
            // Diatas karena dicek terlebih dahulu sudah salah berapa kali??
            // Karena diatas dibaca lebih dulu baru code yang bawah
            // Jika salah mencapai 3x maka akun akan terblokir
            if (countSalah == 3){
                System.out.println("Akun anda Terblokir Sementara, Hubungi Bapak Faiq");
                //dirubake false karena ingin menghentikan looping
                flag = false;
                // Menghentikan pembacaan koding
                break;
            }
            System.out.print("Masukkan PIN Anda : ");
            String PIN = input.nextLine();
            //Jika benar maka looping akan berhenti dan bernilai true/benar
            if (PIN.equals(Satu.getPIN())) {
                flag = false;
                Tiga.menu();
            }
            // Jika salah maka countSalah akan bertambah 1 sampai bernilai 3
            if (!PIN.equals(Satu.getPIN())){
                System.out.println("Password Salah.. Kesempatan(" + (2-countSalah) + ")");
                countSalah++;}
        }

    }
}

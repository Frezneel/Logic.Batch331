package BankBBF;

import java.util.Scanner;

public class Satu {
    // Pin jumlah 6 angka (Tidak kurang tidak lebih)
    // PIN tidak boleh character selain numeric

    private static String PIN; // Data PIN Input Pertama kali
    private static String PIN2; // Digunakan untuk Memastikan PIN yang dimasukkan sama dengan yang diingat
    private static Scanner input = new Scanner(System.in);

    public static void buatPIN(){
        boolean flag = true; // Digunakan untuk menandai looping terus belanjut (true) atau berhenti (false)
        while (flag) {
            System.out.println("=================================");
            System.out.println("Masukkan pin Baru anda : (6 Angka)");
            System.out.println("*Pastikan hanya tipe angka saja");
            System.out.print("Masukkan : ");
            PIN = input.nextLine();
            // Jika PIN yang dimasukkan kurang atau lebih dari 6
            if (PIN.length() != 6) {
                System.out.println("Angka terlalu banyak atau kurang dari '6'");
            } else {
                // Pengecekan PIN apakah terdapat bukan angka.
                while (Validation.isNumeric(PIN)){
                    // Jika tidak terdapat, memastikan lagi PIN yang dimasukkan apakah sama atau tidak
                    System.out.println("Untuk memastikan PIN sama, Masukkan PIN Lagi : ");
                    PIN2 = input.nextLine();
                    // Pengecekan PIN ke 1 dengan PIN ke 2 apakah sudah sama
                    if (isSame(PIN, PIN2)) {
                        // Jika sama maka looping akan diberhentikan dan pembacaan kode diberhentikan
                        flag = false;
                        break;
                    }
                }
            }
        }
    }

    public static String getPIN() {
        return PIN;
    }

    public static void setPIN(String PIN) {
        Satu.PIN = PIN;
    }

    public static boolean isSame (String PIN, String PIN2){
        if(!PIN.equals(PIN2)){
            System.out.println("PIN 1 dengan PIN 2 tidak sama");
            return false;
        }
        return true;
    }
}

package BankBBF;

import java.util.Scanner;

public class EmpatDua {
    private static Scanner input = new Scanner(System.in);
    private static int saldo;
    private static boolean flag = true;

    public static void transfer(){
        saldo = EmpatSatu.getSaldo();
        flag = true;

        while (flag){
            System.out.println("=== MENU Transaksi Transfer ===");
            System.out.println("1. Antar Rekening");
            System.out.println("2. Antar Bank");
            System.out.println("3. Kembali Ke-Menu");
            System.out.print("Pilihan : ");
            String pilihan = input.nextLine();
            if (Validation.isNumeric(pilihan)){
                switch (pilihan){
                    case "1" :
                        AntarRekening.menuAntarRekening();
                        break;
                    case "2" :
                        AntarBank.menuAntarBank();
                        break;
                    case "3" :
                        System.out.println("Mohon pilih yang ada di Menu !!");
                        break;
                    default:
                        break;
                }
            }
        }
    }



}

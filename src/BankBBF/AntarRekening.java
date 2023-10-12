package BankBBF;

import java.util.Scanner;

public class AntarRekening {
    private static Scanner input = new Scanner(System.in);
    private static String rekening;
    private static int saldo;
    private static boolean flag = true;
    private static int minimumTransfer = 10000;
    public static void menuAntarRekening(){
        saldo = EmpatSatu.getSaldo();
        flag = true;
        while (flag){
            System.out.println("===== Menu Transfer Antar Rekening =====");
            System.out.println("Masukkan Rekening Tujuan Penerima : ");
            System.out.println("- Pastikan Nomor rekening memiliki panjang 7 digit angka");
            System.out.print("Masukkan : ");
            rekening = input.nextLine();
            if(rekening.length() != 7){
                System.out.println("Angka kurang atau lebih dari 7 digit, Pastikan panjang 7 digit angka!");
            }
            else{
                if (Validation.isNumeric(rekening)){
                    System.out.println("Masukkan Jumlah uang yang akan ditransfer.");
                    System.out.println("- Minimum transfer sebesar Rp. 10.000");
                    String jumlahUang = input.nextLine();
                    if (Validation.isNumeric(jumlahUang)){
                        int uangTransfer = Integer.parseInt(jumlahUang);
                        if (saldo < uangTransfer){
                            System.out.println("Saldo Anda tidak mencukupi.");
                            System.out.println("\nApakah masih ingin melakukan transfer ? y/n");
                            String pilihan = input.nextLine();
                            if (!pilihan.toLowerCase().equals("y")){
                                flag = false;
                                Dua.cekPIN();
                            }
                        }else if(uangTransfer <= minimumTransfer){
                            System.out.println("Mohon maaf untuk Minimum transfer sebesar Rp.10.0000");
                            System.out.println("\nApakah masih ingin melakukan transfer ? y/n");
                            String pilihan = input.nextLine();
                            if (!pilihan.toLowerCase().equals("y")){
                                flag = false;
                                Dua.cekPIN();
                            }
                        }
                        else {
                            System.out.println("Transfer Berhasil");
                            System.out.println("Kepana nomor rekening : " + rekening);
                            System.out.println("Dengan jumlah transfer : Rp. " + uangTransfer);
                            saldo -= uangTransfer;
                            EmpatSatu.setSaldo(saldo);
                            System.out.println("Sisa Saldo Anda : Rp. " + saldo);
                            System.out.println("\nApakah masih ingin melakukan transaksi ? y/n");
                            String pilihan = input.nextLine();
                            if (pilihan.toLowerCase().equals("y")){
                                flag = false;
                                Dua.cekPIN();
                            }else {
                                flag = false;
                                System.out.println("Terimakasih telah melakukan transaksi");
                            }
                        }
                    }
                }
            }
        }
    }
}

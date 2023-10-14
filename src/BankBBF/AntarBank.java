package BankBBF;

import java.util.Scanner;

public class AntarBank {
    private static boolean flag = true;
    private static int saldo;
    private static String rekening;
    private static int minimumTransfer = 10000;
    private static Scanner input = new Scanner(System.in);
    public static void menuAntarBank(){
        saldo = Soal041.getSaldo();
        flag = true;
        while (flag){
            System.out.println("===== Menu Transfer Antar Rekening =====");
            System.out.println("Masukkan Rekening Tujuan Penerima : ");
            System.out.println("- Pastikan Nomor rekening 3 digit code bank + 7 digit nomor rekening");
            System.out.print("Masukkan : ");
            rekening = input.nextLine();
            if(rekening.length() != 10){
                System.out.println("Angka kurang atau lebih dari 7 digit, Pastikan panjang 7 digit angka!");
            }
            else{
                if (Utility.isNumeric(rekening)){
                    System.out.println("Masukkan Jumlah uang yang akan ditransfer.");
                    System.out.println("- Minimum transfer sebesar Rp. 10.000");
                    String jumlahUang = input.nextLine();
                    if (Utility.isNumeric(jumlahUang)){
                        int uangTransfer = Integer.parseInt(jumlahUang);
                        if (saldo < uangTransfer){
                            System.out.println("Saldo Anda tidak mencukupi.");
                            System.out.println("\nApakah masih ingin melakukan transfer ? y/n");
                            String pilihan = input.nextLine();
                            if (!pilihan.toLowerCase().equals("y")){
                                flag = false;
                                Soal02.cekPIN();
                            }
                        }else if(uangTransfer <= minimumTransfer){
                            System.out.println("Mohon maaf untuk Minimum transfer sebesar Rp.10.0000");
                            System.out.println("\nApakah masih ingin melakukan transfer ? y/n");
                            String pilihan = input.nextLine();
                            if (!pilihan.toLowerCase().equals("y")){
                                flag = false;
                                Soal02.cekPIN();
                            }
                        }
                        else {
                            System.out.println("Transfer Berhasil");
                            System.out.println("Kepana nomor rekening : " + rekening);
                            System.out.println("Dengan jumlah transfer : Rp. " + uangTransfer);
                            saldo -= uangTransfer;
                            Soal041.setSaldo(saldo);
                            System.out.println("Sisa Saldo Anda : Rp. " + saldo);
                            System.out.println("\nApakah masih ingin melakukan transaksi ? y/n");
                            String pilihan = input.nextLine();
                            if (pilihan.toLowerCase().equals("y")){
                                flag = false;
                                Soal02.cekPIN();
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

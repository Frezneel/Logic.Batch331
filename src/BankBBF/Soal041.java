package BankBBF;

import java.util.Scanner;

public class Soal041 {
    private static Scanner input = new Scanner(System.in);
    private static String tunai;
    private static boolean flag = true;

    private static int saldo = 0;

    private static int limit = 25000000;
    public static void setorTunai(){
        flag = true;
        while (flag){
            System.out.println("=== Menu Transaksi Setor Tunai ===");
            System.out.println("Limit Stor Harian pada ATM BBF Sekarang : Rp." + limit);
            System.out.println("Masukkan Uang yang ingin disetor");
            System.out.print("Rp. ");
            tunai = input.nextLine();
            if(Utility.isNumeric(tunai)){
                int tunaiSetor = Integer.parseInt(tunai);
                if(tunaiSetor <= limit){
                    System.out.println("Apakah anda yakin? y/n");
                    String pernyataan = input.nextLine();
                    if (pernyataan.equals("y")){
                        System.out.println("Anda berhasil melakukan Setor Tunai sebesar : Rp." + tunai);
                        limit =- tunaiSetor;
                        saldo = saldo + tunaiSetor;
                        System.out.println("Apakah masih ingin melakukan transaksi? y/n");
                        String jawaban = input.nextLine();
                        if (jawaban.equals("y")){
                            flag = false;
                            Soal02.cekPIN();
                        }else {
                            flag = false;
                            break;
                        }
                    }else {
                        System.out.println("Kembali ke Menu Setor Tunai");
                    }

                }else {
                    System.out.println("Uang disetor melebihi limit hari ini, Silakan setor kurang dari Rp. " + limit);
                }
            }
        }
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Soal041.saldo = saldo;
    }
}

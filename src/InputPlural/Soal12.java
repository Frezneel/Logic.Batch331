package InputPlural;

import jdk.jshell.execution.Util;

import java.util.Scanner;

public class Soal12 {

    public static void resolve(){
        System.out.println("==== Ranking Player (Perbandingan Leadeboard) ====");
        System.out.println("Masukkan Nilai Leaderboard : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        Scanner input = new Scanner(System.in);
        String inputLeaderboard = input.nextLine();
        int[] nilaiLeaderboard = Utility.ConvertStringToArrayInt(inputLeaderboard);
        int panjangLeaderboard = nilaiLeaderboard.length;
        System.out.println("Masukkan Nilai Player : ");
        System.out.println("Contoh : 1 2 3 4 5");
        System.out.println("Masukkan : ");
        String inputPlayer = input.nextLine();
        int[] nilaiPlayer = Utility.ConvertStringToArrayInt(inputPlayer);
        int panjangPlayer = nilaiPlayer.length;
        String tampung = "";
        // Menggabungkan leaderboard dengan nilai player
        for (int i = 0 ; i < panjangLeaderboard; i ++) {
            tampung += nilaiLeaderboard[i] + " ";
        }
        for (int i = 0 ; i < panjangPlayer; i ++) {
            tampung += nilaiPlayer[i] + " ";
        }

        int[] newLeaderboard = Utility.ConvertStringToArrayInt(tampung);
        int panjangNewLeaderboard = newLeaderboard.length;
        int[] urut = new int[panjangNewLeaderboard];

        int counter = 0;
        // Memberi nilai urutan pada leaderboard dari besar ke kecil
        for (int i = 0; i < panjangNewLeaderboard ; i++) {
            for (int j = 0; j < panjangNewLeaderboard; j++) {
                if (newLeaderboard[i] != newLeaderboard[j]){
                    if (newLeaderboard[i] < newLeaderboard[j]){
                        counter++;
                    }
                }
            }
            urut[i] = counter;
            counter = 0;
        }
        System.out.print("Output = ");
        // Mencocokan nilai pada player dengan leaderboard baru, kemudian mengambil nomor urutannya
        for (int i = 0; i < panjangPlayer; i++) {
            for (int j = 0; j < panjangNewLeaderboard; j++) {
                if (nilaiPlayer[i] == newLeaderboard[j]){
                    System.out.print( (urut[j]+1) + " ");
                    break;
                }
            }
        }

        Utility.mauLagi();
    }

}

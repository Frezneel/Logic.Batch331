package Basic;

import java.util.Scanner;

public class Trapesium {
    private static Scanner input = new Scanner(System.in);
    private static double panjangAtas;
    private static double panjangBawah;
    private static double tinggi;
    private static double sisiMiring;

    public static void luas(){
        // Luas & Keliling Trapesium
        // Luas Trapesium = (1/2) x (a+b) x t

        System.out.println("!! LUAS !!");
        System.out.print("Masukkan panjang Atas dalam (cm) = ");
        panjangAtas = input.nextDouble();
        System.out.print("Masukkan Panjang Bawah/Alas dalam (cm) = ");
        panjangBawah = input.nextDouble();
        System.out.print("Masukkan Tinggi dalam (cm) = ");
        tinggi = input.nextDouble();

        double luas_trapesium = (0.5) * (panjangAtas + panjangBawah) * tinggi;

        System.out.println("Nilai Luas trapesium = " + luas_trapesium + " cm²");
    }

    public static void keliling(){
        // Keliling = AB + BC + CD + DA
        System.out.println("!! KELILING !!");
        System.out.print("Masukkan panjang Atas dalam (cm) = ");
        panjangAtas = input.nextDouble();
        System.out.print("Masukkan Panjang Bawah/Alas dalam (cm) = ");
        panjangBawah = input.nextDouble();
        System.out.print("Masukkan Tinggi dalam (cm) = ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan Sisi Miring dalam (cm) = ");
        sisiMiring = input.nextDouble();
        double keliling_trapesium = panjangAtas + panjangBawah + sisiMiring+ sisiMiring;

        System.out.println("Nilai Keliling trapesium = " + keliling_trapesium + " cm");
    }
}

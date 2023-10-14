package Basic;

import java.util.Scanner;

public class Segitiga {
    private static Scanner input = new Scanner(System.in);
    private static double tinggi;
    private static double alas;
    // Luas & Keliling Segitiga
    public static void luas(){
        // Luas Segitiga = (1/2) x alas x tinggi
        System.out.println("!! LUAS !!");
        System.out.print("Masukkan alas dalam (cm) = ");
        alas = input.nextDouble();
        System.out.print("Masukkan Tinggi dalam (cm) = ");
        tinggi = input.nextDouble();

        double luas_segitiga = (0.5) * alas * tinggi;

        System.out.println("Nilai Alas = " + alas + " cm" + " | Nilai Tinggi = " + tinggi + " cm");
        System.out.println("Nilai Luas Segitiga = " + luas_segitiga + "cm²");
    }

    public static void keliling(){
        // keliling Segitiga = sisix3
        // sisi = alas

        System.out.println("!! KELILING !!");
        System.out.print("Masukkan alas dalam (cm) = ");
        alas = input.nextDouble();
        System.out.print("Masukkan Tinggi dalam (cm) = ");
        tinggi = input.nextDouble();

        double keliling_segitiga = alas*3;

        System.out.println("Nilai Alas = " + alas + " cm" + " | Nilai Tinggi = " + tinggi + " cm");
        System.out.println("Nilai Keliling Segitiga = " + keliling_segitiga + "cm");

    }

}

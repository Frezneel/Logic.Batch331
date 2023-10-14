package Basic;

import java.util.Scanner;

public class Persegi {
    private static Scanner input = new Scanner(System.in);
    private static double sisi;

    public static void luas(){
        // Luas & keliling Persegi
        // Rumus Luas : S x S
        // Rumus Keleling : 4 x S

        System.out.println("!! LUAS !!");
        System.out.print("Masukkan nilai sisi Persegi dalam (cm) = ");
        sisi = input.nextDouble();

        double luas_persegi = sisi * sisi;

        System.out.println("Nilai Luas Persegi = " + luas_persegi + " cm²");
    }

    public static void keliling(){

        System.out.println("!! KELILING !!");
        System.out.print("Masukkan nilai sisi Persegi dalam (cm) = ");
        sisi = input.nextDouble();

        double keliling_persegi = 4 * sisi;

        System.out.println("Nilai Keliling Persegi  = " + keliling_persegi + " cm");
    }
}

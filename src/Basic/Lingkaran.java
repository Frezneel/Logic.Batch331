package Basic;

import java.util.Scanner;

public class Lingkaran {
    private static Scanner input = new Scanner(System.in);
    private static double jariJari;

    public static void luas(){
        // Luas & keliling Lingkaran

        System.out.println("!! LUAS !!");
        double phi = 3.14;
        System.out.print("Masukkan Jari-jari dalam (cm) = ");
        jariJari = input.nextDouble();

        double luas_lingkaran = phi * jariJari * jariJari;
        double math_luas_lingkaran = Math.PI * jariJari * jariJari;

        System.out.println("Nilai Luas Lingkaran = " + luas_lingkaran + " cm²");
        System.out.println("Nilai Luas Lingkaran (Math) = " + math_luas_lingkaran + " cm²");
    }

    public static void keliling(){
        System.out.println("!! KELILING !!");
        double phi = 3.14;
        System.out.print("Masukkan Jari-jari dalam (cm) = ");
        jariJari = input.nextDouble();

        double keliling_lingkaran = 2 * phi * jariJari;
        double math_keliling_lingkaran = 2 * Math.PI * jariJari;

        System.out.println("Nilai Keliling Lingkaran = " + keliling_lingkaran + " cm");
        System.out.println("Nilai Keliling Lingkaran (Math) = " + math_keliling_lingkaran + " cm");
    }
}

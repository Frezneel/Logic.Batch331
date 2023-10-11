package Basic.BangunDatar;

import java.util.Scanner;

public class PersegiPanjang {

    private static Scanner input = new Scanner(System.in);
    private static double panjang;
    private static double lebar;

    public static void luas(){
        // Luas Persegi Panjang
        // luas persegi panjang = panjang x lebar;
        System.out.println("!! LUAS !!");
        System.out.print("Masukkan panjang dalam (cm) = ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar dalam (cm) = ");
        lebar= input.nextDouble();

        double luas_persegi_panjang = panjang * lebar;
        System.out.println("Hasil dari Luas Persegi Panjang = " + luas_persegi_panjang + " cm²");
    }

    public static void keliling(){
        System.out.println("!! KELILING !!");
        System.out.print("Masukkan panjang dalam (cm) = ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar dalam (cm) = ");
        lebar = input.nextDouble();

        double keliling_persegi_panjang = (2 * panjang) + (2 * lebar) ;
        System.out.println("Hasil dari Keliling Persegi Panjang = " + keliling_persegi_panjang + " cm²");
    }

}

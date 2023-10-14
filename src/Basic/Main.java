package Basic;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int age = 23;
        String nama = "Galih Muhammad Ichsan";
        boolean flag = true;
        String answer;

        while (flag) {

            Scanner input = new Scanner(System.in);

            System.out.println("SELAMAT PAGI DUNIA TIPU-TIPU!!");
            System.out.println("Perkenalkan saya \"" + nama + "\"");
            System.out.println("Umur saya saat ini \'" + age + "\' Tahun");

            System.out.println("SILAKAN PILIH BANGUN DATAR : ");
            System.out.println(" 1. Persegi Panjang ");
            System.out.println(" 2. Segitiga ");
            System.out.println(" 3. Trapesium ");
            System.out.println(" 4. Lingkaran ");
            System.out.println(" 5. Persegi");

            System.out.print("Jawab : ");

            int pilihan = input.nextInt();

            String promp = "Pilih Perhitungan : \n1. Luas \n2. Keliling";
            int input2;
            switch (pilihan) {
                case 1:
                    System.out.println("!!Memilih Persegi Panjang!!");
                    System.out.println(promp);
                    input2 = input.nextInt();
                    if (input2 == 1) {
                        PersegiPanjang.luas();
                    } else if (input2 == 2) {
                        PersegiPanjang.keliling();
                    } else {
                        System.out.println("Pilihan Tidak Ada, Masukkan sesuai dengan pilihan diatas !!");
                    }
                    break;
                case 2:
                    System.out.println("!!Memilih Segitiga!!");
                    System.out.println(promp);
                    input2 = input.nextInt();
                    if (input2 == 1) {
                        Segitiga.luas();
                    } else if (input2 == 2) {
                        Segitiga.keliling();
                    } else {
                        System.out.println("Pilihan Tidak Ada, Masukkan sesuai dengan pilihan diatas !!");
                    }
                    break;
                case 3:
                    System.out.println("!!Memilih Trapesium!!");
                    System.out.println(promp);
                    input2 = input.nextInt();
                    if (input2 == 1) {
                        Trapesium.luas();
                    } else if (input2 == 2) {
                        Trapesium.keliling();
                    } else {
                        System.out.println("Pilihan Tidak Ada, Masukkan sesuai dengan pilihan diatas !!");
                    }
                    break;
                case 4:
                    System.out.println("!!Memilih Lingkaran!!");
                    System.out.println(promp);
                    input2 = input.nextInt();
                    if (input2 == 1) {
                        Lingkaran.luas();
                    } else if (input2 == 2) {
                        Lingkaran.keliling();
                    } else {
                        System.out.println("Pilihan Tidak Ada, Masukkan sesuai dengan pilihan diatas !!");
                    }
                    break;
                case 5:
                    System.out.println("!!Memilih Persegi!!");
                    System.out.println(promp);
                    input2 = input.nextInt();
                    if (input2 == 1) {
                        Persegi.luas();
                    } else if (input2 == 2) {
                        Persegi.keliling();
                    } else {
                        System.out.println("Pilihan Tidak Ada, Masukkan sesuai dengan pilihan diatas !!");
                    }
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada, Masukkan sesuai dengan pilihan diatas !!");

            }

            System.out.println("Apakah mau menghitung ulang lagi? y/n");
            input.nextLine();
            answer = input.nextLine();

            if(!answer.toLowerCase().equals("y")){
                flag = false;
            }
        }

    }
}
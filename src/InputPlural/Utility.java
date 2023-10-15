package InputPlural;

import java.io.CharArrayReader;
import java.util.Scanner;

public class Utility {
    public static int[] ConvertStringToArrayInt(String text){
        String[] textArray = text.split(" ");
        int[] intArray = new int[textArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(textArray[i]);
        }

        return intArray;
    }

    public static String[] ConvertStringToArrayString(String text){
        String[] textArray = text.split(" ");
        String[] stringArray = new String[textArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(textArray[i]);
        }

        return stringArray;
    }

    public static boolean isNumber(String text){
        try {
            int angka = Integer.parseInt(text.replace(" ",""));
            return true;
        }catch (NumberFormatException e){
            System.out.println("Pastikan hanya tipe nomor saja!");
            return false;
        }
    }

    public static void mauLagi(){
        System.out.println("==== Apakah mau lihat soal lain ? y/n =====");
        System.out.print("Jawab : ");
        Scanner input = new Scanner(System.in);
        String pilihan = input.nextLine();

        if (pilihan.toLowerCase().equals("y")) {
            Main.menu();
        }if (pilihan.toLowerCase().equals("n")){
            System.exit(0);
        }
    }

}

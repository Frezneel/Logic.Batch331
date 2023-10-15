package InputPlural;

import java.util.Scanner;

public class Example {
    public static void Reslove(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input deret angka");
        String text = input.nextLine();

        int[] intArray = Utility.ConvertStringToArrayInt(text);
        int length = intArray.length;

        for (int i = 0; i < length; i++) {
            // Mengambil data pada array yang berada didepan
            if (i == 0){
                System.out.print(intArray[length - 1] + " ");
            } // Mengambil data pada array yang berada dibelakang
            else if(i == length - 1){
                System.out.print(intArray[0]);
            }else
            {
                System.out.print(intArray[i] + " ");
            }
        }
        Utility.mauLagi();
    }
}

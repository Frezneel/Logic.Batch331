package InputPlural;

public class Utility {
    public static int[] ConvertStringToArrayInt(String text){
        String[] textArray = text.split(" ");
        int[] intArray = new int[textArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(textArray[i]);
        }

        return intArray;
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
}

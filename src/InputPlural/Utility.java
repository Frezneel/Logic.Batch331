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
}

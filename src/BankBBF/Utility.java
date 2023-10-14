package BankBBF;

public class Utility {
    public static boolean isNumeric (String input){
        // Mengecek apakah PIN bernilai NULL
        if(input == null){
            return false;
        }else{
            try {
                // Merubah String PIN ke bentuk Integer, jika terdapat bukan angka maka akan ada error dan akan masuk ke catch
                int validation = Integer.parseInt(input);
                return true;
            }catch (NumberFormatException e){
                System.out.println("Terdapat tipe data selain angka, Pastikan tipe data input adalah angka saja!");
                return false;
            }
        }
    }
}

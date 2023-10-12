package DeretAngka;

public class Soal07 {

    public static void resolve(int n){
        int awal = 2;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = awal;
            awal *= 2;
        }

        Utility.print1D(result);

    }
}

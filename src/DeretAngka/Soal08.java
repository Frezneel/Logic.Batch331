package DeretAngka;

public class Soal08 {

    public static void resolve(int n){
        int awal = 3;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = awal;
            awal *= 3;
        }

        Utility.print1D(result);
    }
}

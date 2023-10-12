package DeretAngka;

public class Soal11 {

    public static void resolve(int n){
        int awal = 1;
        int sebelum = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = awal;
            if (i > 0 ){
                sebelum = result[i-1];
                awal += sebelum;
            }else {
                awal += sebelum;
            }
        }

        Utility.print1D(result);
    }
}

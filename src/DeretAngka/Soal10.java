package DeretAngka;

public class Soal10 {

    public static void resolve(int n){
        int awal = 3;
        int tanda = 1;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (tanda % 4 == 0){
                result[i] = 111;
                awal *= 3;
                tanda += 1;
            }else {
                result[i] = awal;
                awal *= 3;
                tanda += 1;
            }
        }

        Utility.print1D(result);
    }
}

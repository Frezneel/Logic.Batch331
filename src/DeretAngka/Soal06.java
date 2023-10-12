package DeretAngka;

public class Soal06 {

    public static void resolve(int n){
        int awal = 1;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (awal % 3 == 0){
                result[i] = 0;
                awal +=(4);
            }else {
                result[i] = awal;
                awal += 4;
            }
        }

        Utility.print1D(result);

    }
}

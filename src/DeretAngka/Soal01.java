package DeretAngka;

public class Soal01 {

    public static void resolve(int n){
        // 1 3 5 7 9 11 13
        int ganjil = 1;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = ganjil;
            ganjil += 2;
        }

        Utility.print1D(result);
    }
}

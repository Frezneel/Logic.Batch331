package DeretAngka;

public class Soal04 {

    public static void resolve(int n){
        int tambah = 1;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = tambah;
            tambah += 4;
        }

        Utility.print1D(result);

    }
}

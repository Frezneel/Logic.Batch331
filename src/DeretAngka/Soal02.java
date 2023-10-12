package DeretAngka;

public class Soal02 {
    public static void resolve(int n) {
        int genap = 2;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = genap;
            genap += 2;
        }

        Utility.print1D(result);

    }
}

package DeretAngka;

public class Soal09 {

    public static void resolve(int n){
        int awal = 4;
        int count = 4;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (count % 3 == 0){
                result[i] = 0;
                count +=1;
            }else {
                result[i] = awal;
                awal *= 4;
                count +=1;
            }
        }

        Utility.print1D(result);
    }
}

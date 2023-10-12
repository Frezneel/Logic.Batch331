package DeretAngka;

public class Soal12 {
    public static void resolve(int n){
        int primer = 0;
        int counter = 0;
        int tambah = 1;
        int[] result = new int[n];

        for (int i = 0; i < n * 10; i++) {
            for (int j = 0; j <= i ; j++) {
                tambah = j < 1 ? 1 : 0;
                tambah += j;
                if ((i+1)%(tambah) == 0){
                    counter += 1;
                }
            }
            if (counter <= 2 && counter > 1){
                result[primer] = (i+1);
                primer ++;
            }
            if (primer == (n)){
                break;
            }
            counter = 0;
        }
        Utility.print1D(result);
    }
}

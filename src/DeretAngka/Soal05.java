package DeretAngka;

public class Soal05 {

    public static void resolve(int n){
        int awal = 1;
        // Penanda agar ketika n ke 3 skip jadi print *
        int count = 1;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            //Tidak ditambahkan 4 karena frame skip
            if (count % 3 == 0){
               result[i] = 0;
               count +=1;
            }else {
                result[i] = awal;
                awal += 4;
                count += 1;
            }
        }
        Utility.print1D(result);

    }
}

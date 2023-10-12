package DeretAngka;

public class Utility {
    public static void print1D(int[] resolve){
        for (int i = 0; i < resolve.length; i++) {

            if(i == (resolve.length-1)){
                if (resolve[i] == 0){
                    System.out.println("*");
                } else if (resolve[i] == 111) {
                    System.out.print("XXX");
                }else {
                    System.out.println(resolve[i]);
                }
            }else {
                if (resolve[i] == 0){
                    System.out.print("*,");
                } else if (resolve[i] == 111) {
                    System.out.print("XXX, ");
                }
                 else {
                    System.out.print(resolve[i]+", ");
                }
            }
        }
    }
}

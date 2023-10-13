package Array2D;

public class Utility {
    public static void printArray2D(int[][] resolve ){
        for (int i = 0; i < resolve.length; i++) {
            for (int j = 0; j < resolve[i].length; j++) {
                if(j == (resolve[i].length-1)){
                    System.out.print(resolve[i][j]);
                }else {
                    System.out.print(resolve[i][j]+", ");
                }
            }
            System.out.println();
        }
    }

    public static void printArray2DString(String[][] resolve){
        for (int i = 0; i < resolve.length; i++) {
            for (int j = 0; j < resolve[i].length; j++) {
                System.out.print(resolve[i][j]);
            }
            System.out.println();
        }
    }
}

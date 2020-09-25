/*package Array;
import java.util.Arrays;
import java. util.Random;

public class Arrays2dExcs {
    public static void main(String[] args) {
        Random rnd = new Random();
        Arrays2dExcs arrays2dExcs = new Arrays2dExcs();
        int[][] array2d = new int [2][4];
        System.out.println("The length of this array is " + array2d.length);
        System.out.println("the depth of this array is " + array2d[0].length);
   //     System.out.println(calculateMultiDSum(arrayMD));

        for (int i =0; i < array2d.length; i++){
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = rnd.nextInt(100);
                System.out.println("[" + i +"]-[" + j + "] -->" + array2d[i][j]);
            }
   //     }
        /*
      for (int i = 0; i < array2d.length; i++){
         for (int j = 0; j < array2d[0].length; j++) {
                System.out.println("[" + i +"]-[" + j + "] -->" + array2d[i][j]);
            }
        }
*/
  //       for (int i = 0; i < array2d.length; i++){
   //           System.out.println("[" + i + "]--->" + Arrays.toString(array2d[i]));
   //       }

  //       int[] sumOfArray2d = Arrays2dExcs.calculateMultiDSum(array2d);
 //        int[] sumOfArray2dNestedLoop = arrays2dExcs.culculateMultiDSumNestedLoop(array2d);

  //      System.out.println("The sum of 2d array is " + Arrays.toString(sumOfArray2d));
  //      System.out.println("The sum of 2d array by nested loops is " + Arrays.toString(sumOfArray2dNestedLoop));
    //      }
   /*       public int[] calculateMultiDSum(int[][] arrayMD) {
        int [] sums = new int[arrayMD.length];
        for (int i = 0; i < arrayMD.length; i++) {
            sums [i] = culculate1DArraySum(arrayMD[i]);
        }
        return sums;
    }
    public int[] calculateMultiDSumNestedLoops(int[][] arrayMD) {
        int[] sums = new int[arrayMD.length];
        for (int i = 0; i < arrayMD.length; i++){
            int sum = 0;
            for (int j = 0; j < arrayMD[i].length; j++) {
                sum += arrayMD[i][j];
                System.out.println("[" + i + "] - [" + j + "]---> " + arrayMD[i][j]);
            }
            System.out.println("here sum is " + sum);
            sums[i] = sum;
        }
        return sums;
    }
}
*///
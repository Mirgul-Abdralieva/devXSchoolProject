
package Array;

import java.util.Arrays;

public class LargestFindArray {
    public static void main(String[] args) {
        int[] arr = {42, 55, 99};

        System.out.println("Largest of "+ Arrays.toString(arr) + " "+ largest(arr));
    }
        private static int largest ( int[] arr){
            int largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (largest < arr[i]) ;
            }  // end conditional
            return largest;
        }    // end for loop
    }




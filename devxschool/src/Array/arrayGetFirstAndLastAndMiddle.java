package Array;

import java.util.Arrays;

// Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
public class arrayGetFirstAndLastAndMiddle {
    public static void main(String[] args) {
        int[] array = new int[3];

        int[] array1 = {1, 2, 3};
        int[] arr = {7, 8, 9};                   // firstLast (arr);

        //  int[]array2 = ReverseArray( array1);
        System.out.println(Arrays.toString(ReverseArray(array1)));
        int[] arrayA = new int[]{1, 2, 3};
        int[] arrayB = new int[]{5, 6, 7};
        System.out.print(Arrays.toString(GetMiddleOfTwoArrays(arrayA, arrayB))); // call method via println();
        System.out.println();

        System.out.println(Arrays.toString(firstLast(arr)));  // call method firstLast (arr) in main method via println();

    }

    public static int[] ReverseArray(int[] array1) {
        return new int[]{
                array1[2], array1[1], array1[0]};
    }
// Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

    public static int[] GetMiddleOfTwoArrays(int[] arrayA, int[] arrayB) {
        return new int[]{
                arrayA[1], arrayB[1]};
    }

    // Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    // The original array will be length 1 or more.
    // makeEnds({1, 2, 3}) → {1, 3}
    //makeEnds({1, 2, 3, 4}) → {1, 4}
    //makeEnds({7, 4, 6, 2}) → {7, 2}
    public static int[] firstLast(int[] arr) {
        int[] returnArr = new int[2];
        if (arr.length == 1) {
            returnArr[0] = arr[0];
            returnArr[1] = arr[0];
        } else {
            returnArr[0] = arr[0];
            returnArr[1] = arr[arr.length - 1];
        }
        return returnArr;
    }
}


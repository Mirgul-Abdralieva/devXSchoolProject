package Array;

// Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
// The original array will be length 1 or more.
// makeEnds({1, 2, 3}) → {1, 3}
//makeEnds({1, 2, 3, 4}) → {1, 4}
//makeEnds({7, 4, 6, 2}) → {7, 2}

import java.util.Scanner;

public class arrayGetFirstAndLastElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt(); }
        FirstLast(A);
    }
    public static void FirstLast( int[] A) {
        int[] B = {A[0], A[A.length-1]};
        if (A.length > 1) {                        // check A == B?
            for (int i =0;i < B.length; i++)
            System.out.print(B[i] + " ");
        } else {
            System.out.println("Array must be bigger than 1!");
        }
    }
}

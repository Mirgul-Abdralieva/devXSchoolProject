package CodingBatPractice;

import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean neg = scanner.nextBoolean();
        System.out.println(posNeg(a,b,neg));
    }

    public static boolean posNeg (int a, int b, boolean neg) {
        if (neg) {

            return  (a < 0 && b < 0);
        } else {

            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}

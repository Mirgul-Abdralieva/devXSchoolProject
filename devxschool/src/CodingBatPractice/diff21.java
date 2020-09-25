package CodingBatPractice;

import java.util.Scanner;

public class diff21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println (diff21(n));
    }

    public  static int diff21(int n) {
        int result = 0;
        if (n >= 21) {
            result = 2 * (n - 21);
        } else {
            result = 21 - n;
        }
        return result;
    }
}

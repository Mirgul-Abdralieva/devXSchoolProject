package CodingBatPractice;

import java.util.Scanner;

public class makes10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println( makes10 (  a, b));
    }

    public static boolean makes10 ( int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }
}

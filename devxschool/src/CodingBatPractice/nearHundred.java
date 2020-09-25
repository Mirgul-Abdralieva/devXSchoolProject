package CodingBatPractice;

import java.util.Scanner;

public class nearHundred {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(nearHundred (n));
    }

    public static boolean nearHundred (int n) {
        if ((Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10)) {
            return true;
        } else {
            return false;
        }
    }
}

package CodingBatPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sumDouble {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sumDouble (a,b));

    }

    public static int sumDouble (int a, int b) {
        int result = a + b;
        if ( a == b) {
            result = result * 2;
        } return result;

        }

    }


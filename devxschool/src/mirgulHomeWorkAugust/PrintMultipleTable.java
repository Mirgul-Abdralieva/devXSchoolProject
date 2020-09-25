package mirgulHomeWorkAugust;

import java.util.Scanner;

public class PrintMultipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printMultTable ( number);
    }

    public static void printMultTable (int number) {
        for (int i = 1; i <=number; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}


package mirgulHomeWorkAugust;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";


        do {
            System.out.println("enter P, R, S,  or Q to quit!");
            command = scanner.next();

            if (command.equals("Q")) {
                break;
            }
        }
        while (true);
        System.out.println("Loop has been broken!");


        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
            System.out.println("I will be there if not 3 ");
        }
    }
}

















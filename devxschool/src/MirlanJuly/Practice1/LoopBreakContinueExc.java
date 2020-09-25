package MirlanJuly.Practice1;

import java.util.Scanner;

public class LoopBreakContinueExc {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        String command = "";
        do {
            System.out.println("enter P,R,S or Q to quit");
            command = userInput.next();
            if (command.equals("Q")) {
                break;
            }
        } while (true);
        System.out.println("loops has been broken");

        // Print numbers with continue ---> skip iteration all of even numbers;

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}


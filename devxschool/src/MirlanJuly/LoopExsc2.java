package MirlanJuly;

import java.util.Scanner;

public class LoopExsc2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean isValidInput = false;
        int a;
        do {
            System.out.println("enter integer to continue, enter anything else to exit");
            if (userInput.hasNextInt()) {
                isValidInput = true;
                a = userInput.nextInt();
                System.out.println("You got another chance ---->"+ a);
            } else {
                isValidInput = false;
                System.out.println("No another chance, sorry");
            }
        } while (isValidInput);

        // Exc:

        int i;
        int x = 10;

        for (i = 1; i < 10; i++) {
            System.out.println(i);
              i = i + 2;
        }
    }
}


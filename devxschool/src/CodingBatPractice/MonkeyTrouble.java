package CodingBatPractice;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        monkeyTrouble(a,b);

        System.out.println(monkeyTrouble(a,b));

    }

    public static boolean monkeyTrouble(boolean aSmille, boolean bSmille){
        if (aSmille && bSmille || !aSmille && !bSmille){
            return true;
        }
        else{
            return false;
        }
    }
}

package CodingBatPractice;

import java.util.Scanner;

public class parrotTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        boolean talking = scanner.nextBoolean();

        System.out.println(parrotTrouble(talking, hour));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
}

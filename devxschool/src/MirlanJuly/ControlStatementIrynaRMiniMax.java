package MirlanJuly;
import java.util.Scanner;
public class ControlStatementIrynaRMiniMax {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter three numbers in any order : ");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        int max = (Math.max(c, (Math.max(a, b))));
        System.out.println("The maximum of 3 numbers is : " + max);
        int min = (Math.min(c, (Math.min(a, b))));
        System.out.println("The minimun of 3 numbers is : " + min);
        int mid = a + b + c - max - min;
        System.out.println("Middle of 3 is : " + mid);
    }
}

package mirgulHomeWorkAugust;
import java.util.Scanner;
public class ChangeToUpperLetter {
    public static void main(String[] args) {
        ChangeToUpperLetter changeToUpperLetter = new ChangeToUpperLetter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first and last name in lower letter:");
        String fullName = scanner.nextLine();

        System.out.println("Your full name is: " + convertFirstLastNameToUpperCase(fullName));
    }
    public static String convertFirstLastNameToUpperCase(String fullName) {
        int spaceIndex = fullName.indexOf(" ");
        String result1 = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, spaceIndex);
        String result2 = fullName.substring(spaceIndex, spaceIndex + 2).toUpperCase() + fullName.substring(spaceIndex + 2);
        return result1 + result2;
    }
}


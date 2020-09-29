package MirlanClassExamples;
import java.util.Scanner;
import java.util.Random;

/**  Write a java program that takes a single character from the alphabet and Print Vowel or Consonant, depending of the user input.
 *   If the user input is not a letter ( between a and z or A and Z), or a string of length > 1, print " Input length is longer than 1"
 *   Hint:
 *   lowercase letters are beetwin 97 and 122 char
 *   Example output:
 *   Input an alphabet:
 *   p
 *   Input letter is Consonant
 */
public class VowelOrConsonant {
    public static void main(String args []) {

        System.out.println("Input a single character from the alphabet: ");
        Scanner input = new Scanner(System.in);
        String enteredString = input.next();

        // checks whether an input has 1 letter

        if (enteredString.length() > 1) {
            System.out.println("a string of length > 1, print  Input length is longer than 1");
        } else if (enteredString.length() == 1 ) {
            System.out.println("Input letter is Vowel");

            System.exit(0);

        } else {
            System.out.println("Input letter is Consonant");
        }
              // converts String to lower case char

        char toChar = enteredString.toLowerCase().charAt(0);
        System.out.println(toChar);
        String result = "";
    }
}

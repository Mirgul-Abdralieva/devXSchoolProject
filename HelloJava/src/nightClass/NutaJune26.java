package nightClass;
        import java.util.Scanner;
public class NutaJune26 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("How old are you? ");
        int age = input.nextInt();
        System.out.println(" Where are you from? ");
        String country = input.next();
        System.out.println(" Your name is " + name + "," + " You are " + age + "years old, " + " You are from " + country);
        /* How to check Number is Positive or Negative using: if else
        How to check Number is Positive or Negative using: ternary operation
        How to check Number is Positive or Negative using: switch case and static method
         */

    }

}
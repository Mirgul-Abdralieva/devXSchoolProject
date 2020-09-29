package nightClass;
import java.util.Scanner;
public class NutaClassVoidMethod1 {
    // Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
String name = "Even";
String  name1 = "Odd";
        System.out.println("Is Even?" + isOddOrEven(a));


        System.out.println("multiply is " + multiply(a, b));

        System.out.println(" Are two numbers equal?" + equal( a, b));
        System.out.println("division is " + divide (a, b));
    }

    public static boolean isOddOrEven(int a) {
        if (a % 2 == 0) {
return true;
        } else {
return false;
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean equal(int a, int b) {
        if (a == b) {

           return true;
        } else
            return false;
    }
public static int divide (int a, int b){
        return a/b;
}

}

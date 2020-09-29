package nightClass;
import java.util.Scanner;
public class methodReturn {
    //  Write code for Void and return Methods for operators: + ; - ; * ; / ; %
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
               int a = input.nextInt();
               int b = input.nextInt();
    //    SumOfTwoNumbers(a,b); // Optional
        System.out.println("Sum of two numbers is " + (a+b));
        System.out.println("Minus of two numbers is " + (a-b));
        System.out.println("Product of two numbers is " + (a*b));
        System.out.println("Division of two numbers is " + (a/b));
        System.out.println("Modulo of two numbers is " + (a % b));
    }
    public static int SumOfTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int subtractionOfTwoNum (int a, int b) {
        int Minus = a - b;
        return a - b;
    }
    public static int Multiplication( int a, int b) {
        int product = a*b;
        return a*b;
    }
    public static int Divide(int a, int b) {
         int division = a/b;
         return a/b;
    }
    public static int Modulo(int a, int b) {
        int reminder = a % b;
        return a % b ;
    }
}









package nightClass;
import java.util.Scanner;
public class methodVoid {
  //  Write code for Void and return Methods for operators: + ; - ; * ; / ; %
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

    sumOfTwoNumbers(a,b);
    subtractionOfTwoNum(a,b);
    multiplication1(a,b);
    divide(a,b);
    Modulo(a,b);
}
public static void sumOfTwoNumbers( int a, int b) {
    int sum1 = a + b;
    System.out.println("sumOfTwoNumbers is "+sum1);
}
public  static void subtractionOfTwoNum(int a, int b) {
    int subtraction1 = a-b;
    System.out.println("subtractionOfTwoNum is "+ subtraction1);
}
    public static void multiplication1(int a, int b) {
        int product1 = a * b;
        System.out.println("multiplication1 is "+ product1);
    }
    public static void divide(int a, int b) {
    int division1 = a/b;
        System.out.println("divide is "+ division1);
    }
    public static void Modulo(int a, int b) {
        int reminder = a % b;
        System.out.println("Modulo is " + reminder);
    }
}


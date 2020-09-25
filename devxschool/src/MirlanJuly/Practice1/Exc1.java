package MirlanJuly.Practice1;
import java.util.Random;
import java.util.Scanner;
//  Write a Java method to find the smallest number among three numbers
public class Exc1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 3 numbers.");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();

        System.out.println("the minimum of numbers " + a + " " + b + " and  " + c + " is " + findSmallest(a, b, c));
    }
        public static int findSmallest ( int a, int b, int c){

            if (a < b && a < c) {
                return a;
            } else if (b < a && b < c) {
                return b;
            } else {
                return c;
            }
    }
    }
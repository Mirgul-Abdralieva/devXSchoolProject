package MirlanJuly;
import java.util.Random;
import java.util.Scanner;
//  Write a Java method to find the smallest number among three numbers

public class Exc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 3 numbers.");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        //int minValue = findSmallest(a,b,c);
    }
    public static void findAndPintSmallest(int a, int b, int c){
        int min = a;
        if (a < b && a < c){
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }
        System.out.println("the minimum of numbers "+a+" "+b+" and  "+c+" is "+min);
    }
}

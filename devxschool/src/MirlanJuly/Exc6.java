package MirlanJuly;
import java.util.Random;
import java.util.Scanner;
public class Exc6 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter some floating piont number");
        double number = userInput.nextDouble();
        System.out.println("The number you have entered is "+floatingDecider(number));
    }
//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
   public static String floatingDecider(double number){
       String result = "";
       if (number == 0.0) {
            result = "zero";
       }else if (number < 0.0) {
        } else {
            result = "positive";
           if (number < 1.0) {
                result += " small";
           } else if( number > 1000000.0) {
                result += " large";
            }
        }
        return result;
   }
}





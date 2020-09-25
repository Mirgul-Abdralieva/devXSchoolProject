package MirlanJuly;
import java.util.Random;
import java.util.Scanner;
public class Exc5 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter radius of the circle");
        double radius = userInput.nextDouble();

        System.out.println("The area of the circle is " + calculateCircleArea(radius));

    }
        public static double calculateCircleArea(double radius){
            return Math.PI * Math.pow(radius, 2);
        }
    }
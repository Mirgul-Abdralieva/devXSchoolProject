package nightClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scanner.nextInt();
        System.out.println("Enter year of your service: ");
        int yearOfService = scanner.nextInt();
        double bonus1 = salary * 0.03;
        double bonus2 = salary * 0.05;
        double noBonus = 0.0;
//        if (yearOfService >= 3 && yearOfService < 5) {
//            System.out.println("Your bonus is: " + bonus1);
//        } else if (yearOfService >= 5) {
//            System.out.println("Your bonus is: " + bonus2);
//        } else {
//            System.out.println("Sorry, you are not eligible for our bonus program.");
//        }

             double result = (yearOfService >= 3 && yearOfService < 5) ? bonus1 : (yearOfService >= 5) ? bonus2 : noBonus;
             System.out.println("your bonus is: " + result);
    }

    }

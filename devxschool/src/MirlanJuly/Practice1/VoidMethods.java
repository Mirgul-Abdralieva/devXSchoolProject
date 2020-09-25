package MirlanJuly.Practice1;

import java.util.Scanner;

public class VoidMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        printName(name);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        addTwoNumbers(num1, num2);

        num1 = input.nextInt();
        num2 = input.nextInt();
        addTwoNumbers(num1, num2);

    }
        public static void printName(String name){
            System.out.println("The name is " + name);
        }

        public static void addTwoNumbers(int num1, int num2){
            System.out.println("sum is: " + num1 + num2);
        }
    }
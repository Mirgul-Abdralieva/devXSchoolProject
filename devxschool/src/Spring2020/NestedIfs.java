package Spring2020;

import java.util.Scanner;

//Write a program to see if the user is eligible to work
//users under 18 cannot work
//users over 60 cannot work
public class NestedIfs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("You are a minor");
            System.out.println("Not Eligible To Work yet");}
            else if (age < 60)   {
            System.out.println("You are eligible to work");}

        else if ( age >=60) {
            System.out.println(" You are not eligible to work ");}

            else if ( age >=18) {
            System.out.println(" You are eligible to work ");}

            else {
            System.out.println(" You are not eligible to work ");}
        }

}

package nightClass;
import java.util.Random;
import java.util.Scanner;
public class PracticeTime1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
         String name1 = "";
         String name2 = "";
         int s =3600;
         int hours = input.nextInt();

        System.out.println("Sum is: " + sumOfTwo(a , b ));
        System.out.println("isEqual(" + a +"," +b +") ---> " +equal(a,b));
        System.out.println("Your number"+ a+ " is Even?:----> " + isEvenOrOdd (a));
        System.out.println("Enter your hours and I will convert it to seconds:---->"+ hours);
        System.out.println(" If hours is:" + hours + " ,Then Seconds is:-----> " + howManySeconds(hours,s) );
        System.out.println("The sum of yours numbers <100 is " + equalOfSum ( a,b,c));
        System.out.println("if number is: " + a + " ------> then increments the number by +1 is: " + increments ( a));
        System.out.println("Your number: " + a + " ----> is evenly divisible by(" + a + ") and is: " + modulo (a));


    }
//Exc1: Create a method that takes two integers as arguments and return their sum.
    public static int sumOfTwo (int a, int b) {
        return (a+b);
    }
 //Exc2:  Create a method that takes two integers and checks if they are equal.
 public static boolean equal (int a, int b) {
     if (a == b) {
         return true;
     } else {
         return false;
     }
 }
//Exc3: Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.
     public static boolean isEvenOrOdd (int a) {
         if (a % 2 ==0) {
             return true;
         } else {
             return false;
         }
     }
     //Task-1: Write a method that converts hours into seconds.exc: howManySeconds(2) ➞ 7200; howManySeconds(10) ➞ 36000;
    public static int howManySeconds(int hours, int s) {
        return  hours* s;
        }
//  Task-2: Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
     public static boolean equalOfSum (int a, int b,int c) {
        if ((a+b+c)<100 ){
            return true;
         } else {
            return false;
        }
    }
    // Task-3: Create a function that takes a number as an argument, increments the number by +1 and returns the result.
public static int increments (int a) {
        return  ( ++a);
    }
   //  Task-4: Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
   public static boolean modulo (int a) {
        if ( a % 5 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}


















package nightClass;
import java.util.Scanner;
import java.util.Random;
public class floatingDecider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers: a, b, c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        //   int min = findAndPrintSmallest(a, b, c);
        //   System.out.println("min of a,b,c is " + min);
        System.out.println("min of a, b, c, is: " + findSmallest( a, b, c));
        System.out.println("Average is "+ calculateAverage(a,b,c));
        System.out.println("I toss the coin and it is "+ tossTheCoin());
        System.out.println("the lone sum of numbers "+a+" "+b+" and "+c+" is "+ loneSum(a, b, c));
        System.out.println("Please enter radiuis of the circle");
        double radius = input.nextDouble();
        System.out.println("The area of the circle is "+calculateCircleArea(radius) );

        System.out.println("Please enter some floating point number");
        double number = input.nextDouble();
        System.out.println("The number you have entered is "+floatingDecider(number));

    }

    //Exc1:  Write a Java method to find the smallest number among three numbers:
    public static void findAndPrintSmallest(int a, int b, int c) {
        int min = a;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }
        System.out.println("min of a,b,c is " + min);
    }

    //Exc1:  Write a Java method to find the smallest number among three numbers:(int a, int b, int c)
    public static int findSmallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
    //Exc2. Write a Java method to compute the average of three numbers.
public static double calculateAverage(int a, int b, int c) {
        return (a+b+c)/3;
}
//exc3. Simulate tossing a coin.
    public static String tossTheCoin() {
        String coin = "";
        Random random = new Random();
        int toss = random.nextInt(2);
        switch (toss) {
            case 0:
            coin="tail";
            break;
            case 1:
            coin="head";
            break;
        }
        return coin;
    }
//exc3: Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//ab+c; bc+a; ac+b = c+a+b; (113; 311; 131):
    public static int loneSum (int a, int b, int c) {
        if (a==b && a==c) {
            a=0;
            b=0;
            c=0;
        }
        if (a==b) {
            a=0;
            b=0;
        }
        if (a==c) {
            a=0;
            c=0;
        }
        if ( b==c) {
            b=0;
            c=0;
        }
        return c+b+a;
    }
//  exc4. Find the area of the circle.
    public static double calculateCircleArea (double radiuis) {
        return Math.PI * Math.pow(radiuis,2);
    }
//  exc5. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
    // Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

    public static String floatingDecider (double number) {
        String result =" ";

        if (number==0.0) {
            result = "zero";
        } else if (number<0.0) {
            result = "negative";
        } else {
            result = "positive";
            if (number<1.0) {
                result += "small";
            } else if (number> 1000000.0){
                result += "large";
            }
        }
return result;
    }
}
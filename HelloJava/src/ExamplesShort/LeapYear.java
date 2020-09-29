package ExamplesShort;

import java.util.Scanner;

/**
 * Write a java program to find out if the given year is leap or not
 *
 *  sample output:
 * enter any calendar year : 2000
 * 2000 is a leap year
 */

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year ");
        year = scanner.nextInt();
        LeapYear input = new LeapYear();
        System.out.println( input.leapOrNot (year)   );
    }
    public boolean leapOrNot(int year){
        if ((year % 4 ==0 && year % 100 != 0) || year % 400 ==0){
            return true;
        } else {
            return false;
        }
    }
}

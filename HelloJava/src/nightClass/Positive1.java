package nightClass;
// How to Check Number is Positive or Negative using:    if    else
import java.util.Scanner;

public class Positive1 {
    public static boolean positive(int number){
        if (number>=0){
            return true;}
        else {
            return false;}
        }
        public static void main(String[]args){
            System.out.println("Enter Number:");
            Scanner sc=new Scanner(System.in);
            int number = sc.nextInt();
            if (positive(number)) {
                System.out.println("Number is possitive!");
            } else {
                System.out.println("Number is negative!");

            }
    }
}

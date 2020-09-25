package mirgulHomeWorkAugust;

import java.util.Scanner;
public class Jun27 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        System.out.println("What is your name? Please type your answer bellow correctly ");
        String output = input.nextLine();
        System.out.println("How old are you? PLS enter only digit number");
        int age = input.nextInt();
        System.out.println("Do you have kids? say Yes or No");
        String yesOrno = input.next();  // if answer is "No" what is a way go directly to line 17 - (helps need)
        System.out.println("How many son do you have? PLS enter only digit number");
        short num1 = input.nextShort();
        System.out.println("How many girls do you have? PLS enter only digit number");
        byte num2 = input.nextByte();
        System.out.println(" Sounds good! Please baby ask yours own personal question!!! Because we love you anyway ");
        String answer = input.next();
        boolean user= true;
        System.out.println(" Yes of cource! Go Ahead! and Don't forget to comeback baby" );

    }
}

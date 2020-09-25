package CodingBatPractice;

import java.util.Scanner;

public class notString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String str = scanner.next();

            System.out.println( notString( str));

        }

    public static String  notString(String str) {
        String result;
        if (str.length() >= 3 && str.substring(0,3).equals("not")) {
            result = str;
        } else {
            result = "not" + str;
        }
        return result;
    }
}

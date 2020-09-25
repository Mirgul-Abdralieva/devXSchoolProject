package CodingBatPractice;

import java.util.Scanner;

public class front3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        front3 front3 = new front3();
       front3.front3(str);
        System.out.println(front3.front3(str));
    }
    public String front3 (String str) {

        String front;
        if (str.length() <3) {
            return str;
        } else {
            front = str.substring(0,3);
            return front+ front + front;
        }
    }
}

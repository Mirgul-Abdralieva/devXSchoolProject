package MirlanJuly;
import java.util.Scanner;
public class ControlStatementJiydeOption {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        System.out.println((a > b && a>c)? "a is max" : (a<b && a<c)? "a is min" : "a is neither greatest nor the smallest");
        System.out.println((b > a && b>c)? "b is max" : (b<a && b<c)? "b is min" : "b is neither greatest nor the smallest");
        System.out.println((c > a && c>b)? "c is max" : (c<a && c<b)? "c is min" : "c is neither greatest nor the smallest");
    }
}


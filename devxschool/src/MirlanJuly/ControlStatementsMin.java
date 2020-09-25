package MirlanJuly;
import java.util.Scanner;
public class ControlStatementsMin {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a number");
        a = userInput.nextInt();
        System.out.println("Enter b number");
        b = userInput.nextInt();
        System.out.println("Enter c number");
        c = userInput.nextInt();

        if (a<b && b<c || a<c && c<b){
            System.out.println("min is " + a);
        }   else if (b<a && a<c || b<c && c<a){
            System.out.println("min is " + b);
        } else if (c<b && b<a || c<a && a<b) {
            System.out.println("min is " + c);
        } else {
            System.err.println("By By! "); }
    }
}




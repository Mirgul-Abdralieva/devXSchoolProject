package MirlanJuly;
import java.util.Scanner;
public class ControlStatementMax {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a number");
        a = userInput.nextInt();
        System.out.println("Enter b number");
        b = userInput.nextInt();
        System.out.println("Enter c number");
        c = userInput.nextInt();

    if (a<b && b<c || b<a && a<c){
        System.out.println("max is " + c);
}   else if (a<c && c<b || c<a && a<b){
            System.out.println("max is " + b);
        } else if (c<b && b<a || b<c && c<a) {
            System.out.println("max is " + a); }
    else {
            System.err.println("By By! "); }
    }
}
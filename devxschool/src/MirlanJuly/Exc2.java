package MirlanJuly;
        import java.util.Scanner;
public class Exc2 {
    //  Write a Java method to compute the average of three numbers.

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 3 numbers.");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();

        System.out.println("Myavarage is" + findAvarage(a, b, c));
    }
        public static double findAvarage(int a, int b, int c){
            return (a + b + c )/3;
        }
    }
package nightClass;
        import java.util.Scanner;
public class NutaReturnMethod1 {

    //  Create a method that takes two integers as arguments and return their sum. Void Methods
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = input.nextInt();
        System.out.println("Enter number2");
        int number2 = input.nextInt();

        number1 = input.nextInt();
        number2 = input.nextInt();
        addition(number1, number2);

        System.out.println(" addition is" + (number1 + number2));
    }


        public static  int addition(int number1, int number2){
int sum = number1 + number2;
            return sum;

    }

    }


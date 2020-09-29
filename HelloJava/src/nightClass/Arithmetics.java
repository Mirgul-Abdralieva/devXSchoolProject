package nightClass;

public class Arithmetics {

    public static void main(String[]args){
        int num1=11, num2=22;
        double cents = 0.1, exampleDouble= 0.3;

        int sum= num1 + num2;
        int difference= num1-num2;
        int product= num1*num2;
        int fraction=num2/num1;
        int remainder=num2%3;
        int combination =num1 + sum * product / fraction % remainder;
        System.out.println(combination);

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println( difference + "=" + num1 + " - " + num2 );
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + fraction);
        System.out.println(num1 + " % " + 3 + " = " + remainder);

        sum += 10;  // sum = sum + 10;
        sum -= 10;  // sum = sum - 10;
        sum *= 10;  // sum = sum * 10;
        sum /= 10;  // sum = sum / 10;

        long x =5;
        long y =(x=6);
        System.out.println("I am X" + x);
        System.out.println("I am Y" + y);

        String  cup1 = "cola";
        String  cup2 = "fanta";
        System.out.println("In cup1 I have " + cup1);
        System.out.println("In cup2 I have " + cup2);

         String empty = cup2;
         cup2=cup1;
         cup1=empty;

        System.out.println("In cup1 I have " + cup1);
        System.out.println("In cup2 I have " + cup2);

        int numberInteger = 10;
        double numberDouble = 2.3;

        byte num11 = 77;
        byte num22 = 99;

        int result = num11 + num22;

        System.out.println("The result form byte " + result);
        System.out.println(numberInteger + numberDouble);

        System.out.println( 10 + 10.1f);

    }
}




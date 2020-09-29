package nightClass;

public class MyFirstNightClass {
    public static void main (String[] args){
         //whole numbers
        byte smallNumber=120;
        short shortNumber=120;
        int intNumber=1000000;
        long longNumber=1000000000;

        //decimal numbers
        float floatNumber = 145.43f;
        double doubleNumber = 5435.5435;
        System.out.println(    smallNumber + "+" + shortNumber + " = " + (smallNumber + shortNumber));

        int num1 = 5;
        System.out.println(num1 + "*" + 1 + "=" + (num1 * 1));
        System.out.println(num1 + "*" + 2 + "=" + (num1 * 2));
        System.out.println(num1 + "*" + 3 + "=" + (num1 * 3));
        System.out.println(num1 + "*" + 4 + "=" + (num1 * 4));
        System.out.println(num1 + "*" + 5 + "=" + (num1 *5));
        System.out.println( "divided by %" + 12 % 3);
        System.out.println( 11/2 );
        System.out.println(12.3 / 2.5);
        System.out.println(12.3 % 3.4);

        int num2 = 45;
        byte num3 = 5;
        int result = num2 + num3;
        System.out.println(result);

        byte number1= 120;
        byte number2 =55;
        int result2 = number1 - number2;
        System.out.println(result2);

    }
}

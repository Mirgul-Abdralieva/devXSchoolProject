package MirlanClassExamples;

public class IncreaseAndDecrease {
    public static void main(String[]args){
        int apples = 0;
        int grapes = 10;

        apples +=2;   //  apples = apples + 2; --> 2
        grapes -=2;  // grapes = grapes -2; --> 8

        apples++;   //  apples = apples + 1; --> 3 post increment
        grapes--;   //  grapes = grapes -1; --> 7  post decrement

      //  System.out.println(apples);
      //  System.out.println(grapes);

        // Pre increment and Post increment

        System.out.println("apples are: " + apples);
        System.out.println("grapes are: " + grapes);

        System.out.println("apples are pre inc: " + (++apples));
        System.out.println("grapes are pre dec: " + (--grapes));

        System.out.println("apples are: " + apples);
        System.out.println("grapes are: " + grapes);

        System.out.println("apples are post inc: " + (apples++));
        System.out.println("grapes are post dec: " + (grapes--));

        System.out.println("apples are: " + apples);
        System.out.println("grapes are: " + grapes);

        // Post increment and pre increment exercises

        int peaches = 7;
        int bananas = 5;
        int basket = bananas++ + 1;
        System.out.println("bananas " + bananas + "peaches " + peaches + "basket is " + basket);
        System.out.println("basket is " + basket);
        basket = basket + --peaches;
        System.out.println("bananas " + bananas + "peaches " + peaches + "basket is " + basket);

        int mathGrade = 50;
        int physicsGrade = 75;
        int sum = --physicsGrade + mathGrade++;  // 74 + 50
        int sum1 = mathGrade-- + physicsGrade++;  // 50 + 74
        int totalSum = sum + sum1;

        System.out.println("sum: " + sum + "\n sum1: " + sum1 +"\n physicsGrade: " + physicsGrade + "\n mathGrade: "
                + mathGrade + "\n totalSum: " + totalSum);  //  75  50 totalSum: 249

        int x=5;
        int y = ++x * 5/x--  +  --x;  // y= 6*5/6 + 4 = 9
        System.out.println(y);  // y=9

    }
}

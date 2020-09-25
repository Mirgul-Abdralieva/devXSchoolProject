package MirlanJuly;

public class VoidMethods1 {
    public static void main(String[] args){

        int num1 = 9;
        System.out.println("I am before incrementing: "+num1);
        incrementNum(num1);
        System.out.println("I am after incrementing: "+num1);
    }

    public static void incrementNum(int a){
        System.out.println("I am increment method!");
        a = a + 1;
        System.out.println("I am a , and my values is "+a);
    }
}
/*
public class MyFavoriteMovie {

    public void printMyFavMovie(){
        System.out.println("My Favorite movie is Man in Black!");
    }
}
}
 /*   public static void isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            String result = number + "is even number";
            printMyString(result);
        } else {
            printMyString(number+ " is odd number");
        }
    }
/*
 public static void printMyString(String text){
     System.out.println(text);
 }
}
*/
/*
public static void printName(String name){
        System.out.println("The name is "+name);
        }

public static void addTwoNumbers(int number1, int number2){
        System.out.println("Sum of "+number1+ " and "+ number2 +" = "+number1+number2);
        }

      public static int addition(int num1, int num2){
        return num1+num2;
        }

public void printRandomNumber(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10));
        }

 */
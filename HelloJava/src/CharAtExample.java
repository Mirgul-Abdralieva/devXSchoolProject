public class CharAtExample {
    public static void main(String[] args) {
        String str = "Welcome to string handling tutorial";
        //This will return the first char of the string
        char ch1 = str.charAt(0);
  //This will return the 6th char of the string
        char ch2 = str.charAt(5);
        //This will return the 12th char of the string
        char ch3 = str.charAt(11);
        //This will return the 21st char of the string
        char ch4 = str.charAt(20);

        System.out.println("Character at 0 index is " + ch1);
        System.out.println("Character at 0 index is " + ch2);
        System.out.println("Character at 0 index is " + ch3);
        System.out.println("Character at 0 index is " + ch4);
/**
 * When we pass negative index or the index which is greater than length()-1 then the charAt() method throws IndexOutOfBoundsException.
        String str1 = "BeginnersBook";
        //negative index, method would throw exception
        char ch = str1.charAt(-1);
        System.out.println(ch);
*/
    }
}






// printing the 1st, 6th, 12th and 21st character of the string using charAt() method.
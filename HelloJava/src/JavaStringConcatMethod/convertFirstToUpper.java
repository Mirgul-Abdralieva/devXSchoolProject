
package JavaStringConcatMethod;

import java.util.Scanner;

public class convertFirstToUpper {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String name = "mirgul";

        System.out.println(name. replace ("m", "M"));
        System.out.println(convertFirstToUpper("String s"));
        System.out.println(convertFirstToUpper1("hello"));
    }


      public static String convertFirstToUpper (String s) {

          String firstLetter = s.substring(0, 1).toUpperCase();
          //    String result = firstLetter.concat(s.substring(1,s.length()));
         String result = firstLetter + s.substring(1, s.length());
         return result;
      }

    public static StringBuilder convertFirstToUpper1 (String s) {
        StringBuilder stb = new StringBuilder();
       String name = "mirgul";
       String hello = "Hello my name is ";

        System.out.println(hello + (stb.append(name).delete(0,1).insert(0, "M")));

         return stb;
   }
    }





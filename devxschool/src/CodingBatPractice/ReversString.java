package CodingBatPractice;
// The reverse of the String "abcdef" is "fedcba".
public class ReversString {
    public static void main(String[] args) {
       String str = "abcdef";
       char[] try1 = str.toCharArray();
      for (int i = try1.length - 1; i >= 0;i--){
          System.out.print(try1[i] + " "); }

         String input = "abcxyz";
      StringBuilder input1 = new StringBuilder();
      input1.append(input);          // append a String into StringBuilder input1;
        input1 = input1.reverse();   // reverse StringBuilder input1;
        System.out.println(input1);  // print reversed String;

    //   StringBuilder sb = new StringBuilder("absdef");
      //  sb.reverse();
    //   System.out.println(sb);
    }
    }





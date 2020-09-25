package OlgaPracticeTime;
import java.util.Arrays;
public class ReverseGivenStringOlga {
    public static void main(String[] args) {
        String name = "Zalkar love Java!";
        String sentence = "Zalkar love Java!";

        StringBuilder str = new StringBuilder(name);
        System.out.println(str.reverse());

        int lastInstance = sentence.lastIndexOf(" ");
        System.out.println(sentence.substring(0,lastInstance));

        String [] array = sentence.split(" ");
        System.out.println(Arrays.toString(array));
      //  System.out.println(Arrays.deepToString(2Darray)); // Print 2D Array

        for (int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sentence.replace("java",""));

    }
}

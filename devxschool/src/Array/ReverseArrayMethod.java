package Array;
import java.lang.reflect.Array;
import java.util.Arrays;
// Write a method called reverse(), which takes an array of int and reverse its contents.
// For example, the reverse of [1,2,3,4] is [4,3,2,1].
// The method's signature is as follows:
public class ReverseArrayMethod {

    public static void main(String[] args) {
        int [] array = new int[4];
        int [] array1 = {1, 2,3,4,};
        System.out.println(Arrays.toString(ReverseMethod( array1)));

      //     int[] array2 = ReverseMethod(array1);

    }
    public static int [] ReverseMethod(int[] array1){
        return new int[]{
                array1[3], array1[2], array1[1], array1[0]};
        }
    }


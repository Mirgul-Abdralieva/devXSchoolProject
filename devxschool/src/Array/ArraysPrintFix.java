package Array;
import java.util.Arrays;
public class ArraysPrintFix {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 9, 15, 17};
        for (int index = 0; index < arr1.length; index += 2) {
            System.out.print(index + ", " + arr1[index] + "\n");
        }

        int[] a1 = {1, 3, 7, 9, 15};
        for (int i = a1.length - 1; i >= 0; i--)
            System.out.print(a1[i] + ", ");
    }
}

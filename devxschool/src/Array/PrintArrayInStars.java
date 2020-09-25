package Array;
import java.util.Scanner;
/** Enter the number of items: 5
 Enter the value of all items (separated by space): 7 4 3 0 7
 0: *******(7)
 1: ****(4)
 2: ***(3)
 3: (0)
 4: *******(7)
 //1. Read inputs from the user and store it in the array
 //2. Get each element and print stars till the element size
*/
public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = userInput.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[n];
        for (int i=0; i < n ; i++){
            array [i] = userInput.nextInt();
        }
        for (int i = 0;i < n; i++){
            for (int j = 0; j < array[i]; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

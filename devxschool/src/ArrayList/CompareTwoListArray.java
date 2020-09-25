package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
// Write a Java program to compare two array lists:
public class CompareTwoListArray {
    public static void main(String[] args) {

        String[] colors1 = {"Red", "Green", "Black", "White", "Pink"};

        ArrayList < String > listOfColors1 = new ArrayList<>(Arrays.asList(colors1));
        System.out.println(listOfColors1.toString());

        String[] colors2 = {"Red", "Green", "Black", "Pink"};

        ArrayList < String > listOfColors2 = new ArrayList<>(Arrays.asList(colors2));
        System.out.println(listOfColors2.toString());

        System.out.println(listOfColors1.equals(listOfColors2));

        ArrayList<String> test = listOfColors2;
        ArrayList<String> test1 = listOfColors1;

        if ( listOfColors1.size() > listOfColors2.size()) {
            test = listOfColors1;
            test1 = listOfColors2;
        }

        for (int i = 0; i < test.size(); i++) {
            if (test1.contains(test.get(i))) {
                System.out.print("yes" + " ");
            } else {
                System.out.print(" no ");
            }
        }
    }
}

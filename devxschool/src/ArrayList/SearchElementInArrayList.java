package ArrayList;
// write a program that prints all elements of the ArrayList then try to find "Red" color and print out:
// : Found the element or there is no such elements.

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Black", "White", "Orange"};
        ArrayList<String> listOfColors = new ArrayList<>();
        for (int i = 0; i < colors.length; i++) {
            listOfColors.add(colors[i]);
        }
        System.out.println(listOfColors.toString());

        for (int i = 0; i < listOfColors.size(); i++){
            if (listOfColors.contains("Red")){
                System.out.println("Red");
                break;
            } else {
                System.out.println("No such element");
                break;
            }
        }
        System.out.println(listOfColors.size  ());
        System.out.println(listOfColors.contains("Red "));
        System.out.print(listOfColors.get(0));
        System.out.println(listOfColors.contains("Green "));
        System.out.println(listOfColors.get(1));
        System.out.println(listOfColors.contains("Black "));
        System.out.print(listOfColors.get(2));
        System.out.println(listOfColors.contains("White "));
        System.out.print(listOfColors.get(3));
        System.out.println(listOfColors.contains("Orange "));
        System.out.print(listOfColors.get(4));
        System.out.println(listOfColors.isEmpty());
    }
}

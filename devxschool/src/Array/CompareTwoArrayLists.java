
//Write a Java program to compare two array lists.
package Array;

import java.util.ArrayList;

public class CompareTwoArrayLists {
    public static void main(String[] args) {
        String[] colors1 = {"Red", "Green", "Black", "White", "Pink"};
        ArrayList<String> listOfColors1 = new ArrayList<>();
        for (int i = 0; i < colors1.length; i++) {
            listOfColors1.add(colors1[i]);
        }
        System.out.println(listOfColors1.toString());
        String[] colors2 = {"Red", "Green", "Black", "Pink"};
        ArrayList<String> listOfColors2 = new ArrayList<>();
        for (int j = 0; j < colors2.length; j++) {
            listOfColors2.add(colors2[j]);
        }

        System.out.println(listOfColors2.toString());
        System.out.println(listOfColors1.contains("White"));
        if (listOfColors1.contains("White")) {
            System.out.println("Yes ");
        }
        if (listOfColors2.contains("White")) {
            System.out.println(" Yes ");
        } else {
            System.out.println(" No ");


            for (int i = 0; i < listOfColors1.size(); i++) {
                for (int j = 0; j < listOfColors2.size(); j++) {
                    if (listOfColors1.get(i).equalsIgnoreCase(listOfColors2.get(j))) {
                        listOfColors1.remove(i); }
                    System.out.print(listOfColors1.toString());

                }
            }
        }
        }
    }


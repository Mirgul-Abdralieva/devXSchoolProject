package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RemoveUpdateArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(0.9);
        list.add(true);
        list.add("Help");

        // int ---> primitive data type
        // Integer  ---> object type of Int, Double, Float, String

        String [] cities = {"Chicago", "NY", "SF", "London", "Kara-Kol", "Bishkek", "Kazakhstan"};
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<String> listOfcities = new ArrayList<>();
        for ( int i=0; i< cities.length; i++) {
            listOfcities.add(cities[i]);
        }
        System.out.println(listOfcities.toString());

        listOfcities.set(6,"Almaty");
        System.out.println(listOfcities.toString());
        System.out.println(listOfcities.remove(6));
        System.out.println(listOfcities.remove("Kazakhstan"));
        System.out.println(listOfcities.toString());
        System.out.println(listOfcities.contains("Dubai"));
        System.out.println(listOfcities.contains("Chicago"));

        Random rnd = new Random();

        System.out.println("initial size  " + list1.size());
        for ( int i=0; i< 100; i++) {
            list1.add(rnd.nextInt(100));
         //   System.out.println("current size " + list1.size());
        }
        int a = list1.get(1) + list1.get(5);
        System.out.println("size of the list is " + list1.size());
    }
}

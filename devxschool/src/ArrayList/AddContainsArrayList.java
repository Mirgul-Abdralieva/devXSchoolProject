/**
package ArrayList;

import java.util.ArrayList;

public class AddContainsArrayList {
    private static Object String;
    private static Object ArrayList;

    public static void main(String[] args) {
        String [] cities = { "Chicago", "NY", "SF", "London", "Kara-Kol", "Bishkek", "Almaty"};
        ArrayList<String > listOfCities = new ArrayList<>();
        for ( int i =0; i < cities.length; i++) {
            listOfCities.add(cities[i]);
        }
        System.out.println(listOfCities.toString());

        removeDuplicates(listOfCities);
        System.out.println(listOfCities.toString());
        if (listOfCities.contains("London")) {
            System.out.println("London is capital city of GB!");
        }
        if (listOfCities.contains("Moscow")) {
            System.out.println(" Moscow is capital of Russia!");
        } else {
            System.out.println("Sorry no Moscow!");
        }
         public static void removeDuplicates(ArrayList<String>listOfCities);{
            for (int i = 0; i < listOfCities.size(); i++) {
                for (int j = i + 1; j < listOfCities.size(); j++){
                    if (listOfCities.get(i).equals(listOfCities.get(j))){
                        listOfCities.remove(j);
                    }
                }
            }
        }
    }
}
*/
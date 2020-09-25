package hashSet;

import java.util.*;

public class SetStringManipulation {

    public static void main(String[] args) {

                Set<String> setOfCities = new LinkedHashSet<>();
                setOfCities.add("Istanbul");
                setOfCities.add("Ashgabat");
                setOfCities.add("Moscow");
                setOfCities.add("Chicago");
                setOfCities.add("NY");

        System.out.println(setOfCities.toString());

                for (String city : setOfCities) {
                    System.out.println(city);
                }
                System.out.println(setOfCities.toString());
                System.out.println(setOfCities.remove("Ashgabat"));
                System.out.println(setOfCities.toString());
                System.out.println(setOfCities.size() + " is size of setOfCities");
                System.out.println(" isEmpty? ---> " + setOfCities.isEmpty());
                List<String> usCities = Arrays.asList("NY", "Chicago");
                System.out.println(setOfCities.toString());
                setOfCities.removeAll(usCities);
                System.out.println(setOfCities.toString());

                Iterator<String> citiesIterator = setOfCities.iterator();
                while (citiesIterator.hasNext()) {
                    System.out.println(citiesIterator.next());
                }
                setOfCities.clear();
        System.out.println("isEmpty? " + setOfCities.isEmpty());
        System.out.println(setOfCities.toString());

            }
        }



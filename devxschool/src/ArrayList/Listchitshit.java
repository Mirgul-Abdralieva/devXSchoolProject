package ArrayList;

import java.util.*;

public class Listchitshit {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList <Integer> listInt = new ArrayList<>();

        List<Integer> listInt3 = new ArrayList<>(listInt);
        // create arrayList from Array
        Integer [] arr1 = {1,3,7,2,8,6,6,6};
        List <Integer> listInt2 = Arrays.asList(arr1);
        System.out.println(listInt2);

        List <Integer> listInt4 = Arrays.asList(new Integer [] {1,2,3,4});//can be used to create all type of data
       // add value
       listInt.add(9);

       listInt.addAll(listInt4);
// insert value
        listInt.add(0,10);
        System.out.println(listInt);
        //replace value
        listInt.set(2,8);
        System.out.println(listInt);
        // delete values
        listInt.remove(2);
        listInt.removeAll(listInt4);
        System.out.println(listInt);
        // check if contains
        // Task for Array
//  List <Integer> listInt2 = Arrays.asList(arr1);; check if we have 6
        for (Integer integer : arr1) {
            if (integer == 6) {
                System.out.println("true");
                break;
            } else
                System.out.println("false");
            break;
        }

        System.out.println(listInt.contains(10));
        // check if it has values
        System.out.println(listInt.isEmpty());
        System.out.println(listInt.size());

        //check how many times value present
        //1. with loop
        int count = 0;
        for (Integer a : listInt2){
            if(a == 6){
                count++;
            }
        }
        System.out.println(count);
        // 2. by collection
        System.out.println(Collections.frequency(listInt2,6));

        // sorting
        listInt.add(1);
        listInt.add(3);
        Collections.sort(listInt);
        System.out.println(listInt);
    }
}

package hashSet;
import java.util.*;
public class SetIntegerManipulation {
    public static void main(String[] args) {

        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(1);
        setOfNumbers.add(2);
        setOfNumbers.add(3);
        System.out.println("!!!" + setOfNumbers.add(2));

        for (Integer number: setOfNumbers){
            System.out.println(number);

            System.out.println(setOfNumbers.remove(2));
            System.out.println(setOfNumbers.remove(5));
            System.out.println(setOfNumbers.toString());

            List<Integer> numberList = Arrays.asList(1,2,2,2,3,8,9,10,1,2,3,5,6);
            System.out.println(numberList.toString());

            Set<Integer> noDuplicatesNumbersList = new HashSet<>(numberList);
            System.out.println(noDuplicatesNumbersList.toString());

            Set<Integer> noDupNumListLinkedHash = new LinkedHashSet<>(numberList);
            System.out.println(noDupNumListLinkedHash.toString());

            System.out.println("hashcode " + noDuplicatesNumbersList.hashCode());

            List<Integer> numberList1 = Arrays.asList(1,2,3,4,5,6,7,8);
            List<Integer> numberList2 = Arrays.asList(2,3,4,5,10,11);
            Set<Integer>  numberSet1 = new HashSet<>(numberList1);
            Set<Integer> numberSet2 = new HashSet<>(numberList2);

       //     numberSet1.retainAll(numberList2);

            numberSet1.retainAll(numberList2);

            System.out.println(numberSet1.toString());


            


        }
    }
}

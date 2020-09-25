package ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class commonElementsWithContains {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        addIfNotExists(list1, 1);
        addIfNotExists(list1, 2);
        addIfNotExists(list1, 3);
        addIfNotExists(list1, 1);
        addIfNotExists(list1, 3);

        System.out.println("list1: " + list1.toString());
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(100);

        System.out.println("list2: " + list2.toString());

       ArrayList<Integer> list3 = commonElements(list1, list2);
     //   ArrayList<Integer> list4 = diffElementsWithCOntains(list1, list2);

        System.out.println("The common elements are in list3: " + list3.toString());
    //    System.out.println("The diff elements are in list4: " + list4.toString());
    }
    public static ArrayList<Integer> commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonList = new ArrayList<>();
        for (Integer element1: list1){
            for (Integer element2: list2){
                if (list1.contains(element2)){
                    addIfNotExists(commonList, element2);
                }
            }
        }
        return commonList;
    }
    public static Boolean addIfNotExists(ArrayList<Integer> list, Integer element){
        if (!list.contains(element)) {
            list.add(element);
            return true;
        } else {
            return false;
        }
    }
}

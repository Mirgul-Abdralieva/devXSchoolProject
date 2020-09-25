package hashSet;
import java.util.*;
import java.util.Arrays;
public class SetManipulation4 {
    public static void main(String[] args) {

        SetManipulation4 setManipulation4 = new SetManipulation4();

        Integer[] array1 = {1, 2, 3, 1, 2, 5, 7};
        System.out.println(Arrays.toString(array1));
        Integer[] array2 = {2, 3, 7, 8, 1, 1, 10};
        System.out.println(Arrays.toString(array2));

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(array1));
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        System.out.println(list2);

        HashSet<Integer> set3 = new HashSet<>(list1);
        System.out.println("HashSet3 " + set3);
        HashSet<Integer> set4 = new HashSet<>(list2);
        System.out.println("HashSet4 " + set4);

        TreeSet<Integer> set1 = new TreeSet<>(Arrays.asList(array1));
        System.out.println("TreeSet1: " + set1);
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(array2));
        System.out.println("TreeSet2 " + set2);

        System.out.println("Common elements are: " + Arrays.toString(setManipulation4.findCommonElements(set1, (TreeSet<Integer>) set2)));
        System.out.println("Difference are " + Arrays.toString(setManipulation4.findDifferentElements(array1, array2)));
        System.out.println("Union are " + Arrays.toString(setManipulation4.findUnionElements(array1, array2)));

    }

    public Integer[] findCommonElements(TreeSet<Integer> set1, TreeSet<Integer> set2) {
        set1.retainAll(set2);
        return set1.toArray(new Integer[set1.size()]);
    }

    public Integer[] findDifferentElements(Integer[] array1, Integer[] array2) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(array2));
        HashSet<Integer> tempSet = (HashSet<Integer>) set1.clone();

        set1.removeAll(set2);
        set2.removeAll(tempSet);

        set1.addAll(set2);
        System.out.println("set2 " + set2.toString());
        System.out.println("set1 " + set1.toString());
        return set1.toArray(new Integer[0]);

    }

    public Integer[] findUnionElements(Integer[] array1, Integer[] array2) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(Arrays.asList(array1));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(array2));
        set1.addAll(set2);
        return set1.toArray(new Integer[set1.size()]);
    }
}





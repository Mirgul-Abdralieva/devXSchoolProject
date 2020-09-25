package hashSet;
import java.util.*;
public class SetManipulation5 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,2,1};
        HashSet <Integer> set1 = new HashSet<>();
        for (int i = 0; i< array.length; i++){
            set1.add(array[i]);
        }
        System.out.println(set1);
    }

    }


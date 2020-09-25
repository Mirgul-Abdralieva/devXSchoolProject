package hashSet;
import java.util.*;
public class SetArrayAisha1 {
    public static void main(String[] args) {
        // 1.Write a Java program to add 5 elements to the hash set

        int [] array = {1,2,3,4,2,5};
        HashSet <Integer> set1 = new HashSet<>();
        for (int i = 0; i< array.length; i++){
            set1.add(array[i]);
        }
        System.out.println(set1);
    }
    }


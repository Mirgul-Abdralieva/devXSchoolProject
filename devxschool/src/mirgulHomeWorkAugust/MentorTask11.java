package mirgulHomeWorkAugust;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MentorTask11 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(7, 9, 11, 33, 88));
        System.out.println("the greatest number in the list is: " + getHeight(listOfNumbers));
    }
    public  static  int getHeight(List<Integer>arr){
        Collections.sort(arr);
        arr.set(0,1);
        for (int i= 0; i < arr.size()-1; i++){
            int d = arr.get(i+1) - arr.get(i);
            if (d>1){
                arr.set(i+1,arr.get(i)+1);
            }
        }
        return arr.get(arr.size()-1);
    }
}

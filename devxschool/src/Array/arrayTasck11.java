package Array;

import java.util.*;
import java.util.ArrayList;

public class arrayTasck11 {
    public static void main(String[] args) {
        ArrayList<Integer>list11 = new ArrayList<>();
        list11.add(1);
        list11.add(2);
        list11.add(3);
        list11.add(4);

        arrayTasck11 arrayTasck11 = new arrayTasck11();
        System.out.println(arrayTasck11.smallint(list11));


    }
    public int smallint (ArrayList<Integer>list11){
        int min = list11.get(0);
        for (Integer integer :list11) {

            if (integer < min){
                min = integer;
            }

        }
        return min;
    }
}

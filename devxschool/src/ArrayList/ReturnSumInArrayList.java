package ArrayList;

import java.util.ArrayList;

public class ReturnSumInArrayList {
    public static void main(String[] args) {



    }

    // write a method which returns sum of Integer ArrayList values:
        public Integer sum(ArrayList<Integer>sumOfInteger){
            int sum = 0;
            for (int i = 0; i< sumOfInteger.size(); i++){
                sum += sumOfInteger.get(i);
            }
            return sum;
        }

   // write a method which updates element to element * 2 if the element is odd:

    public void updateList(ArrayList<Integer>list) {
        for ( int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
            list.set(i, list.get(i) * 2);
            }
        }
    }
    }


package Array;

import java.util.Arrays;

public class GetSumCharsArray {
    public static void main(String[] args) {
        String[] strArr = {"hi", "bye", "hola", "mimi", "good"};
        System.out.println("sum of charatcters "+ Arrays.toString(strArr)+" is "+ getSumChars(strArr));
    }
    public static int getSumChars(String[] strArr)
    {
        int sumOfChars = 0;
        for (int i=0; i< strArr.length; i++){
            sumOfChars += strArr[i].length();
        }
        return sumOfChars;
    }
}

package Array;

import java.util.Arrays;

public class ArrayIntroduction_1 {
    public static void main(String[] args) {
        int [] arr1 = new int[4];
        arr1[0] = 1;
        arr1 [1] =9;
        arr1 [2] =3;
        arr1 [3] =8;
String[] str = new String[3];
        str[0] = "I";
        str [1] = "love";
        str [2] ="You!";

        System.out.println(arr1[1]);
        System.out.println(arr1[0]+ arr1[3] + arr1[1] + arr1[2] );
        System.out.println("arr1[0]" + arr1[3] + arr1[1] + arr1[2] );
        System.out.println(" " + arr1[0] + arr1[3] + arr1[1] + arr1[2]);
        System.out.println("year is: " + arr1[0] + arr1[1] + arr1[3] + arr1[2] );
        System.out.println(" " + str[0] + str[1] + str[2]);
        System.out.println(str);

    }
}

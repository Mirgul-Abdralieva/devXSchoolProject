package MirlanJuly;
import java.util.Random;
import java.util.Scanner;
public class Exc4 {
    // Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
    public static int loneSum(int a, int b,int c){
        if (a == b && a == c) {
            a = 0;
            b = 0;
            c = 0;
        }
        if (a == b) {
            a = 0;
            b = 0;
        }
        if (a == c) {
            a = 0;
            c = 0;
        }
        if (b == c) {
            b = 0;
            c = 0;
        }
        return a + b + c;
    }
}

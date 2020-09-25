package hashSet;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// john tom
//john mary
//john tom
//mary anna
//mary anna
public class ProblemHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();

            String[]str = {"Jon tom","john mary","john tom","mary anna","mary anna"};
            HashSet <String> set1 = new HashSet<>();
            for(int j = 0 ;j < 5; j++){
                set1.add(str[j]);
                System.out.println(set1.size());
        }
}
    }
}
package hashSet;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class SetManipulationList1 {
    public static void main(String[] args) {
        // 1.Write a Java program to add 5 elements to the hash set
        //2. Print them to the stdout by for each loop

        HashSet<String> colours = new HashSet<>();
        colours.add("White");
        colours.add("Red");
        colours.add("Green");
        colours.add("Black");
        colours.add("Pink");
        System.out.println(colours);
        for (String colour: colours){
            System.out.println(colour);
        }
        Iterator<String> colourIterator = colours.iterator();
        while (colourIterator.hasNext()){
            System.out.println(colourIterator.next());
        }
    }
}

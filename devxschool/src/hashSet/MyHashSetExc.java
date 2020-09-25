package hashSet;

import java.util.HashSet;

public class MyHashSetExc {
    public static void main(String[] args) {
        HashSet<String> myHS = new HashSet<>();
        myHS.add("Bob");
        myHS.add("Tom");
        System.out.println(myHS);
        for (String names:myHS) {
        System.out.print(names);
        }
    }
}

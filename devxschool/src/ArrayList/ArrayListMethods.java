package ArrayList;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jane");
        names.add(0,"Tomas");
        names.add(1,"Robin");
        names.add("David");
        names.add("Becky");
        // print the list:
        System.out.println("List of all elements: " + names);
        //check is Empty:
        System.out.println("List is Empty? " + names.isEmpty());
        //use contains:
        System.out.println(names.contains("Jane"));
        //Check if the list contains "Becky"
        System.out.println(names.contains("KKKK"));
        //indexOf:
        System.out.println("IndexOff is " + names.indexOf("Jane"));
        //use subList():
        System.out.println("List is:   " + names);
        List < String > list = names.subList(1,4);
        System.out.println("SubList is:  " + list);
        //delete:
        names.removeAll(names);
        //check isEmpty:
        System.out.println("List is Empty? ----> " + names.isEmpty());
        // print all:
        System.out.println(names);







        
    }
}

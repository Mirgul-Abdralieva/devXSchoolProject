package ArrayList;
import java.util.ArrayList;
public class Test_ArrayListHW {
    public static void main(String[] args) {
        //Creating a generic ArrayList:
        ArrayList<String> arLTest = new ArrayList<String>();
        //Size of arrayList:
        System.out.println("Size of ArrayList at creation: " + arLTest.size());
        //Lets add some elements to it:
        arLTest.add("D");
        arLTest.add("U");
        arLTest.add("K");
        arLTest.add("E");
        //Recheck the size after adding elements:
        System.out.println("Size of ArrayList after adding elements: " + arLTest.size());
        //Display all contents of ArrayList:
        System.out.println("List of all elements: " + arLTest);
        //Remove some elements from the list:
        arLTest.remove("K");
        System.out.println("See contents after removing one element: " + arLTest);
        //Remove element by index:
        arLTest.remove(1);
        System.out.println("See contents after removing element by index: " + arLTest);
        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + arLTest.size());
        System.out.println("List of all elements after removing elements: " + arLTest);
        //Check if the list contains "K"
        System.out.println(arLTest.contains("k"));
    }
}

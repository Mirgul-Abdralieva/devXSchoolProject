package CodesForJiraTesting;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
// Description
//Write a Java program to clone an array list to another array list.
//
//1.User should enter an array list, output should to clone an array list to another array list.
//ex:
//Enter your colors:
//Red, White,Black,Green,Pink ( colors can be anything)
//output:
//Original arrays: Red, White,Black,Green,Pink
//Cloned arrays: Red, White,Black,Green,Pink

public class EV9ArrayListCloneOtherList {
    public static void main(String[] args) {
        ArrayList<String > list1= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many inputs do you want to enter?");
        int number = scanner.nextInt();
        System.out.println("Please enter your colors!");
        for (int i = 0; i< number; i++){
            list1.add(scanner.next());
        }

        System.out.println("list1: " + list1.toString());

        ArrayList<String> list2 = cloneTheList(list1);
        ArrayList<String> list3 = cloneTheListByClone(list1);
        System.out.println("list1 cloned into list2: "+ list2.toString());
        System.out.println("list1 cloned by clone into list3: "+ list3.toString());

    }

    public static ArrayList<String> cloneTheList(ArrayList<String> list){
        ArrayList<String> destList = new ArrayList<>();
        for (String element: list)
            destList.add(element);

        return destList;
    }

    public static ArrayList<String> cloneTheListByClone(ArrayList<String> list){

        return (ArrayList<String>) list.clone();
    }
}

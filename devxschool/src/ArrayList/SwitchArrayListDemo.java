package ArrayList;
import java.util.ArrayList;

public class SwitchArrayListDemo {
    public static void main(String[] args) {
        int [] marks = {7, 8, 9, 4};

        ArrayList<Integer> listOfmarks = new ArrayList<>();
        for (int i = 0; i < marks.length; i++){
            listOfmarks.add(marks[i]); }
        System.out.println(listOfmarks.toString());

        switch (2) {
            case 1:
                System.out.println(listOfmarks.add(2) + "  10");
                break;
            case 2:
                System.out.println(listOfmarks.remove(0) + " removed ");
                break;
            default:
                System.out.println("null");
        }
        System.out.println(listOfmarks.toString());
    }
}
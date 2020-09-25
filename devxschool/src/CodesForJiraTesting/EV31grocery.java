package CodesForJiraTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EV31grocery {
    public static void main(String[] args) {
        /**
         * Write a program for a shopping
         * Create a list to go shopping in the EV31grocery
         *
         * ex:
         * How many items do you want to add?
         * 3
         * Please enter item #1
         * watermelon
         * Please enter item #2
         * grapes
         * Please enter item #3
         * yogurt
         * Shopping list: [watermelon, grapes, yogurt]
         */

        Scanner scanner = new Scanner(System.in);
        EV31grocery EV31grocery = new EV31grocery();
        System.out.println("How many items do you want to add?");
        String amount = scanner.next();
        if (EV31grocery.isNumeric(amount)) {
            int num = Integer.parseInt(amount);
            String[] shoppingList = EV31grocery.createList(scanner,num);
            System.out.println("Shopping list: " + Arrays.toString(shoppingList));
        }
        else
            System.out.println("enter only numbers.");

    }


    public String[] createList(Scanner scanner,int num) {

            ArrayList<String> list1 = new ArrayList<>();
            for(int i = 1; i<=num;i++){
                System.out.println("Please enter item #" + i);
                list1.add(scanner.next());
            }
            String [] str = list1.toArray(new String[0]);
            return str;
    }
    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

}




package TaskFromBema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class grocery {

        public static void main(String[] args) {
            /**
             * Write a program for a shopping
             * Create a list to go shopping in the grocery
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
            grocery grocery = new grocery();



            String[] shoppingList = grocery.createList(scanner);
            System.out.println("Shopping list: " + Arrays.toString(shoppingList));

        }

        public String[] createList(Scanner scanner) {
            System.out.println("How many items do you want to add?");
            int num = scanner.nextInt();
            ArrayList<String> list1 = new ArrayList<>();
            for(int i = 1; i<=num;i++){
                System.out.println("Please enter item #" + i);
                list1.add(scanner.next());
            }
            String str [] = list1.toArray(String[]::new);
            return str;
        }
    }


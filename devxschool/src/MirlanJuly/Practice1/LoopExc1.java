package MirlanJuly.Practice1;

public class LoopExc1 {

    public static void main(String[] args) {
        // PrintMultTable(8)

        // long powerOfNum = power(2,5);
        //  System.out.println(powerOfNum);
        String word = "devxschool";
        StringBuilder reverseWordBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWordBuilder.append(word.charAt(i));
        }
        System.out.println(reverseWordBuilder.toString());

  /*      for (int i =1; i<=10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

   */

        int i = 5;
        int b = 1;
        while (b<5) {
            System.out.println(b);
            if (b ==4) {
                break;
            }
                i++;                 // i = i + 2;  // i++;
        }
        do {
            System.out.println("Hello");
        } while (false);           // false;

    }
    }


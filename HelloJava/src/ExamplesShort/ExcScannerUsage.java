package ExamplesShort;

import java.util.Scanner;

public class ExcScannerUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();    // type ---> word;
    //    double y = scanner.nextDouble();   // type ---> decimal-point number= 22.11;
    //  int x = scanner.nextInt();           // type ---> integer number;
     //  boolean z = scanner.nextBoolean(); // type ---> true  or  False;
      //  char a = scanner.next().charAt(0);  // type any simbouls or letter(G);

        System.out.println(str);
    }
}

// String name = userInput.nextLine(); ------>  Read user input;
// System.out.println(name);  -------> Output user input;

// The Scanner class is used to get user input from a user.
// To use the Scanner class, we need create an object of the class: Scanner scanner = new Scanner(System.in);
// String str = scanner.nextLine(); or int x = scanner.nextInt(); or char a = scanner.next().charAt(0);
// we should import the Scanner class from Java library: import.java.util.Scanner;
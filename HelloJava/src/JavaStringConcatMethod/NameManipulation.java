package JavaStringConcatMethod;
import java.util.Scanner;

public class NameManipulation {
    public static void main(String[] args) {
        String firstName;
        String lastName;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your firstName: ");
        firstName = scanner.next();
        System.out.println("enter your lastName: ");
        lastName = scanner.next();
        String fullName = firstName + (" ") + lastName;

        System.out.println("Your fullName: " + fullName);

        NameManipulation nameManipulation = new NameManipulation();

        System.out.println("Full name is " + nameManipulation.convertFirstLetterOfNameAndLastNameToUppercase(fullName));

        System.out.println("Initials are " + nameManipulation.getInitials(fullName));

        System.out.println("First name is " + nameManipulation.getFirstNameFrom(fullName));

        System.out.println("Last name is " + nameManipulation.getLastNameFrom(fullName));


    }
   //  output--> "Full Name:"  Leo Messi;
    public String convertFirstLetterOfNameAndLastNameToUppercase(String fullName) {

        int spaceIndex = fullName.indexOf(" ");
        String result1 = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, spaceIndex);
        String result2 = " " + fullName.substring(4,5).toUpperCase() + fullName.substring(spaceIndex +2);
        String result = result1 + result2;
        return result;
    }

//   output ---> "Initials: " LM;
    public String getInitials(String fullName) {

        int indexS =fullName.indexOf(" ");
        String result1 = fullName.substring(0,1).toUpperCase();
        String result2 =fullName.substring(indexS + 1, indexS +2).toUpperCase();

        return result1 + result2;
    }

//  output--> "First Name:"  Leo;

    public String getFirstNameFrom(String fullName) {

        int indexS = fullName.indexOf(" ");
        return fullName.substring(0,1).toUpperCase() + fullName.substring(1,indexS);

    }

//  output--> "Last Name:"   Messi;
    public String getLastNameFrom(String fullName) {

        int indexS = fullName.indexOf(" ");
        return fullName.substring(indexS + 1,indexS + 2).toUpperCase() + fullName.substring(indexS + 2);
    }
}




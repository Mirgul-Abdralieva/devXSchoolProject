package JavaStringConcatMethod;

// Java string concat() method concatenates multiple strings. We can use concat() method to join more than one strings.
// This method appends the specified string at the end of the given string and returns the combined string.
// The concat() Method signature: public String concat (String str); ---> String s1 = "Beginners"; --> s1=s1.concat("Book").concat(".").concat("com");
// The value of s1 would be BeginnersBook.com after the execution of above statement.

//  In this example we will see two ways of doing String concatenation using concat() method:

public class ConcatMethodSignature {
    public static void main(String[] args) {
        String s1 = "Welcome ";                     // One way of doing concatenation:
        s1 = s1.concat("to ");
        s1 = s1.concat("String handling ");
        System.out.println(s1);

        String s2 = "This ";       //Other way of doing concatenation in one line
        s2 = s2.concat("is ").concat("just a ").concat("String ");
        System.out.println(s2);

        String mystring = ".com ";
        String mystr = "BeginnersBook".concat(mystring);
        System.out.println(mystr);

        //creating a string by java string literal
        String str = "Beginnersbook";
        char arrch[]={'h','e','l','l','o'};
        //converting char array arrch[] to string str2
        String str2 = new String(arrch);

        //creating another java string str3 by using new keyword
        String str3 = new String("Java String Example");

        //Displaying all the three strings
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

    }
}
// String is a sequence of characters, for e.g. “Hello” is a string of 5 characters.
// In java, string is an immutable object which means it is constant and can cannot be changed once it has been created.
// There are two ways to create a String in Java:  1) String literal; --> String str1 = "Welcome"; compiler will create one value in Memory
// 2) Using new keyword; ---> String str1 = new String("Welcome"); String str2 = new String("Welcome");
// String is an object in Java. In this case compiler would create two different object in memory having the same string.
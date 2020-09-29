package ExamplesShort;

public class exam6 {
    public static void main(String[] args) {
        System.out.println("some text in lower case".toUpperCase());
        System.out.println("SOME TEXT IN UPPER CASE".toLowerCase());
        String username = "        username ";
        String password = "password";
        System.out.println(username.length() +" --> length before trim");
        System.out.println(username.trim().length() +" --> length after trim");
        System.out.println("banana".replace('a', 'o'));

        int someVal = 65;
        char someChar = (char)someVal;
        int intvAlueOfB = (int)'B';
        System.out.println(someChar);
        System.out.println(someVal);
        System.out.println(intvAlueOfB);
    }
}



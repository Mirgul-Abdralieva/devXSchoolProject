package ExamplesShort;

public class StringMethod1 {
    public static void main(String[] args) {

        String hello = "Hello my name is ";
        System.out.println(hello.length());
        System.out.println(hello.substring(0,3));
        System.out.println(hello.substring(3));
        System.out.println(hello.substring(2,4));
        System.out.println(hello.substring(0,5));

        System.out.println(hello.substring(0,hello.length()-1));
        System.out.println(hello.substring(0,hello.length()-3));

        StringBuilder stb = new StringBuilder();
        String name = "mirgul";


        System.out.println(hello + name);
        System.out.println(hello.concat(name));
        System.out.println(hello.charAt(0));
        System.out.println(hello.substring(0,1).toLowerCase());
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        System.out.println(hello.substring(0,1).toUpperCase());
        System.out.println(hello.substring(0,hello.length()-1));
        System.out.println(name.substring(0,1).toUpperCase());
        System.out.println(name.substring(0,name.length()-1));
        System.out.println(name.substring(0,name.length()));
        System.out.println(name.substring(0,1).toUpperCase());
        System.out.println(hello+name);
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0,6).toLowerCase());
        System.out.println(name.substring(0,name.length()-1));
        System.out.println(hello+name);
        System.out.println(hello + (stb.append(name).delete(0,1).insert(0, "M")));
    }
}

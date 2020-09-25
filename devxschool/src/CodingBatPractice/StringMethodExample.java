package CodingBatPractice;

public class StringMethodExample {
    public static void main(String[] args) {
        String name = new String();
        String greeting = new String();
        name = " X";

        System.out.println(addTwoStrings(name) + "!");

    }
    public static String addTwoStrings(String name){
        String result;
        if (name.length() >=0 && name.substring(0,1).equals("Hello ")){
            result = name;
        } else {
            return  " Hello" + name;
        }
        return result;
    }
}

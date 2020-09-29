package ExamplesShort;

public class exam5 {
    public static void main(String[] args) {

        String someS = "June06July07August08";
        String bagOfWords = new String(someS);
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
        //index of charactr 'a'
        int myindex = someS.indexOf('a');
        //extract word august
        String august = someS.substring(12, 18);
        System.out.println("August "+august);
        System.out.println("index of b "+(bagOfWords.indexOf("ball", 3)));
        System.out.println("index of cake "+bagOfWords.indexOf("cake", 25));
        System.out.println("last index of ball "+ bagOfWords.lastIndexOf("ball"));
        System.out.println("last index of l "+ bagOfWords.lastIndexOf('l'));
        String month09 = new String("September");
        String month09_1 = new String("September");
        String peach = "PEACh"; //peach
        String peachObject = new String("peach");
        String peach_2 = "Peach";
        System.out.println("September equals to september "+ (month09.equals(month09_1)));
        System.out.println("September == to september "+ (month09 == month09_1));
        System.out.println("peach is equals to peach object "+(peach.equals(peachObject)));
        System.out.println("peach == to peach object " +(peach == peachObject));
        System.out.println("peach == to peach_2  " +(peach == peach_2));
        System.out.println("Compare with ignoreing the case "+peach.equalsIgnoreCase("peach"));
        if (month09 == month09_1) {
            System.out.println("September is september");
        } else {
            System.out.println("September is not septeber");
        }
        System.out.println(bagOfWords);
        System.out.println(someS.trim().toLowerCase().substring(12,18).toUpperCase());
    }
}

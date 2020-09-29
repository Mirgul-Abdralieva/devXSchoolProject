package ExamplesShort;

public class exam3 {


   public static void main(String[] args) {
        int apples = 10;
        int bananas = 9;
        String appleName = "Apples";
        String bananaName = new String("Bananas");

        String sentence1 = "I have " + apples + " of " + appleName;
        String sentence2 = "I have " + bananas + " of " + bananaName;
        String sentence3 = "total of " + (apples + bananas) + " of " + appleName + " and " + bananaName;
        String sentence4 = "total of " + apples + bananas + " of " + appleName + " and " + bananaName;
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);
        System.out.println(sentence4);

        System.out.println("The length of sentence1 :" + sentence1.length());

        char someCharacter = bananaName.charAt(6);
        char lastChar = bananaName.charAt(bananaName.length() - 1);

        System.out.println(someCharacter);
        System.out.println(lastChar);

        String appleBananas = appleName.concat(bananaName);
        System.out.println(">>>> I am an applename after concat "+appleName);
    }
}
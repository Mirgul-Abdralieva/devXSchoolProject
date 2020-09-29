package ExamplesShort;

public class exam4 {
    public static void main(String args[]){

        String bagOfWords = "balljkicountryiuyucakelllballllllcake";
        String cake = bagOfWords.substring(18);
        String country = bagOfWords.substring(7, 14);
        String ball = bagOfWords.substring(0, 4);

        System.out.println("The cake is "+cake);
        System.out.println("The country is "+country);
        System.out.println("The ball is "+ball);

        System.out.println(country.concat(ball.concat(cake))); // country+ball+cake
        System.out.println("The index of c is "+bagOfWords.indexOf('c'));
        System.out.println("The index of word country is "+ bagOfWords.indexOf("country"));

    }
}

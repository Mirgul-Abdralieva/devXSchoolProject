package ExamplesShort;

public class exam1 {
    public static void main(String[] args) {
        String sunday = "Sunday";
        String monday = "Monday";
        sunday = "tuesday";
        System.out.println(sunday);
       String stringInput = "friday";
        System.out.println( halfIt( stringInput));
    }

    public static String halfIt(String stringInput) {
              return stringInput.substring(0, stringInput.length()/2);
}
}
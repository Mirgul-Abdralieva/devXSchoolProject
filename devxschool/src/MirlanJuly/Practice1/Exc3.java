package MirlanJuly.Practice1;
import java.util.Random;
import java.util.Scanner;
public class Exc3 {
    // Simulate tossing a coin
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("I toss the coin and it is " + tossTheCoin());
    }
        public static String tossTheCoin() {
        String coin ="";
        Random random = new Random();
        int toss = random.nextInt(2);
        switch (toss){
        case 0:
        coin = "tail";
        break;
        case 1:
        coin = "head";
        break;
    }
    return coin;
    }
}


package CodingBatPractice;

public class PrintName {
    public static void main(String[] args) {
        char chars[] = {'a', 'd', 'e', 'i', 'k', 'n', 'V', 'v'};
        char moves[] = {6, 5, 4, 3, 10, 4, 5, 3, 5, 3, 1, 7};
        int j = 0;
        for (char move : moves) {
            j += move;
            j %= chars.length;
            System.out.print(chars[j]);
        }
    }
}


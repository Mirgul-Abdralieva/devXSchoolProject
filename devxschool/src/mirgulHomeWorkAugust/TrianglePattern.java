package mirgulHomeWorkAugust;
// Write a program called TrianglePattern that prompts user for the size (a non-negative integer in int);
// and prints the following triangle shape pattern.
public class TrianglePattern {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
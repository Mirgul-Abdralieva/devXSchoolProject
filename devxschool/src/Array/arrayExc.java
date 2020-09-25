package Array;

public class arrayExc {


    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 3};
        System.out.println("It should print 11 " +
                " and your answer is: " + getSum(a1));
    }
}



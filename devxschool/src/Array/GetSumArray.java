package Array;

public class GetSumArray {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        int[] arr = {20, 3, 18, 55, 4};
        System.out.println(getSum(arr));
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        int counter = 0;
        while (counter < arr.length) {
            sum += arr[counter];
            counter++;
        }
        return sum;
    }
}

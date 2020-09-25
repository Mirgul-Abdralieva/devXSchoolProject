package ArrayList;

public class getAverageArray {

    public static double getAverage(int[] arr) {
        int sum=0;
        double average =0.0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        average = sum/arr.length;
        return average;


    }
    public static void main(String[] args) {
        int[] arr = {20, 3, 18, 55, 4};
        System.out.println(getAverage(arr));;
    }
}


package Array;

public class getSumNonNegArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 3, -1, -20};

        System.out.println("The code should print 11 " +
                "and your answer is: " + getSumNonNeg(arr));
    }
        public static int getSumNonNeg(int[] arr)
        {
            int sum = 0;
            for (int value : arr) {
                if (value >= 0)
                    sum += value;
            }
            return sum;
        }
    }


package MirlanJuly.Practice1;

public class LoopExc3 {
    public static void main(String[] args) {



    long powerOfNum = power(2, 5);
        System.out.println(powerOfNum);
}
        public static void printMultTable(int number){
            for (int i = 0; i <= 10; i++) {
                System.out.println(number + "x" + i + "=" +(number*i));
            }

        }

        public static long power(long number, int p) {
            long result = 1;
            for (int i = 1; i <=p; i++) {
                result = result * number;
            }
            return result;
        }
    }

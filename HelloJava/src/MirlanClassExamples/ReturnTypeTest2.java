package MirlanClassExamples;

    // with arguments:
    public class ReturnTypeTest2 {
        public int add(int x, int y) {
            int z = x + y;
            return z;
        }

        public static void main(String[] args) {
            ReturnTypeTest2 test = new ReturnTypeTest2();
            int add = test.add(11,22);
            System.out.println("the sum of x and y is:" + add);
        }
    }


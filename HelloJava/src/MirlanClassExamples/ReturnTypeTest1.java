package MirlanClassExamples;
// without arguments:
public class ReturnTypeTest1 {
    public int add() {
        int x = 30;
        int y = 70;
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        ReturnTypeTest1 test = new ReturnTypeTest1();
        int add = test.add();
        System.out.println("the sum of x and y is:" + add);
    }
}

package mirgulHomeWorkAugust;
import java.util.Scanner;
public class Add2Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(add2Integers( n1, n2) );
    }
    public  static int add2Integers(int n1, int n2) {
        int result = 0;
        if ( n1>=0 && n2>=n1){
            result = n1 + n2;
        } else {
            result = (n1+n2);
        }
        return result;
    }
}

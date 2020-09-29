package nightClass;

public class DiffMethodResult {
    public static void main(String args[]) {
        DiffMethodResult diff = new DiffMethodResult();

        int methodResult = diff.diff21(40);
        System.out.println(methodResult);

        int x = (int) 9.0;   // explicit casting  and result will be : return (int) 9.0;

        // null --> null is a value which represents emptiness.
        // null ---> 0 ; false ; 0.0 ;
        // String str = null;
        // all non primitive data types can be assigned to null;

        diff.methodG(3);
        System.out.println("Method executed completely.");
    }

    public int diff21(int n) {
        int result;

        if (n <= 21) {
            result = 21 - n;
        } else {
            result = (n - 21) * 2;
        }
        return result;       // return (n-21) * 2;  when without result
    }
        //  3
        public void methodG ( int num){
            System.out.println("Method just started");

            if (num < 5) {
                System.out.println("Num is less than 5");
                return;

            } else {
                System.out.println("Num is more than or equal to 5");
                return;
            }
        }
    }


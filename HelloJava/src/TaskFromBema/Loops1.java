package TaskFromBema;

public class Loops1 {
    public static void main(String[] args) {

    int a =0;
    int i;
            while (a < 10) {
                System.out.println(a);
                if (a == 8) {
                    break;
                }
                a++;

            }

    for ( i=1; i<10; i++){
        int c = 5;
      //  System.out.println(c*i);
        System.out.println(i + "*" +c + "="+ (c*i));
    }
}
}

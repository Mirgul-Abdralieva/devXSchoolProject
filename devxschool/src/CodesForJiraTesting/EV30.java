package CodesForJiraTesting;

import java.util.Scanner;

public class EV30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long longsMinimum = -9223372036854775808L;
        long longsMaximum = 9223372036854775807L;
        System.out.println(number + " can be fitted in:");
        if(number>= -128 && number<= 127){
            System.out.println("*byte");
        }
        if(number>=-32768 && number<=32767){
            System.out.println("*short");
        }
        if(number>=-2147483648 &&  number<=2147483647){
            System.out.println("*int");
        }
        if(number>=longsMinimum  && number<=longsMaximum){
            System.out.println("*long");
        }
    }
}

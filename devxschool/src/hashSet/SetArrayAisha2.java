package hashSet;
import java.util.*;
public class SetArrayAisha2 {
    // 1.Write a Java program to add 5 elements to the hash set
    //2. Print them to the std out by for each loop

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet <Integer> set1 = new HashSet();
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++){
            set1.add(s.nextInt());
        }
        System.out.println("----" + set1);
        System.out.println("your 5 numbers: ");
        for(int i :set1){
            System.out.println(set1);}
    }
}

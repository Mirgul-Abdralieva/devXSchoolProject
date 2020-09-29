package nightClass;
import java.util.Scanner;
public class Positive2usingTernaryOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter Number: ");
            int number=sc.nextInt();
            String msg=(number>=0)? "Number is positive!":"Number is negative!";
            System.out.println(msg);
            System.out.println("Do you want to check for other number (Y->yes / N->no);");
            String ch = sc.next();
            if(ch.toLowerCase().equals("n")|| ch.toLowerCase().equals("no")){
                break;
            }

        }
    }
}

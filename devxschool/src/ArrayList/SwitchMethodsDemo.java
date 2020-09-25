package ArrayList;
import java.util.Scanner;
public class SwitchMethodsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter choose one of options: \n0  == My savings, \n 1== My Expend, \n2 == Taxes20%, \n3 ==Insurance5%, \n4 ==Charity10%, \n5 ==rent25%, \n6 == Food10% and then enter your salary ");
        int numOfExpenses = input.nextInt();
        int salary = input.nextInt();

        switch (numOfExpenses) {
            case 0:
                System.out.println("My savings = " + (salary - allExpend(salary)));
                break;
            case 1:
                System.out.println("Your all expenses is : " + allExpend(salary));
                break;
            case 2:
                System.out.println("Your taxes20% is: " + (salary*20/100));
                break;
            case 3:
                System.out.println("Pls pay for Insurance5%:" + (salary*5/100));
                break;
            case 4:
                System.out.println("Don't forgot about Charity10%: " + (salary * 10/100));
                break;
            case 5:
                System.out.println("At least be for rent25% : " + (salary*25/100));
                break;
            case 6:
                System.out.println("My minimum for food10% :--->" + (salary*10/100));
                break;
            default:
                System.out.println("Pls find additional job!");
        }
    }
    public static int allExpend(int salary){       // Method signature

        int food = salary*10/100;
        int rent = salary*25/100;
        int charity = salary*10/100;
        int insurance = salary*5/100;
        int taxes = salary*20/100;
        int allExpend = (food + rent + charity + insurance + taxes);
        return allExpend;
    }
    }



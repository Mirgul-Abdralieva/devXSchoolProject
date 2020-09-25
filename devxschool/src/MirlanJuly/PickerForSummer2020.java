package MirlanJuly;
import java.util.Random;
import java.util.Scanner;
public class PickerForSummer2020 {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        Random r = new Random();

        System.out.println(r.nextInt(12));

        int numberOfStudent = userIn.nextInt();
        String nameOfStudent = " ";

        
        switch (numberOfStudent) {
            case 0:
                nameOfStudent = "Aikel";
                break;
            case 1:
                nameOfStudent = "Iryna R";
                break;
            case 2:
                nameOfStudent = "Mirgul";
                break;
            case 3:
                nameOfStudent = "Jiyde";
                break;
            case 4:
                nameOfStudent = "Almaz";
                break;
            case 5:
                nameOfStudent = "Azamat";
                break;
            case 6:
                nameOfStudent = "Baktygul";
                break;
            case 7:
                nameOfStudent = "Gulnaz";
                break;
            case 8:
                nameOfStudent = "Irina";
                break;
            case 9:
                nameOfStudent = "Kubah";
                break;
            case 10:
                nameOfStudent = "Luis";
                break;
            case 11:
                nameOfStudent = "Ram Disa";
                break;
            case 12:
                nameOfStudent = "Zalkar";
        }
        System.out.println(nameOfStudent);
    }
}



package nightClass;
import java.util.Scanner;
public class meruert1hoursAndSeconds {
    public static void main(String[] args) {
      //  long hours = 0;
        long seconds =3600;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter hours and it will convert it into seconds : ");
        long hours = input.nextLong();
       convertHourToSeconds(hours, seconds);
        System.out.println( convertHourToSeconds(hours,seconds) + " Here is the seconds");
    }
    public static long convertHourToSeconds(long hours, long seconds){
     //   ConvertHoursMethod.seconds = seconds;
        return hours * seconds ;
    }

}

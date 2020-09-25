package MirlanJuly.Practice1;

import java.time.DayOfWeek;
import java.util.Scanner;

public class CodingBatSleepIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean weekDay = input.nextBoolean();
        boolean vacation = input.nextBoolean();

        sleepIn(weekDay, vacation);

        System.out.println(sleepIn(weekDay,vacation));

    }
        public static boolean sleepIn(boolean weekDay, boolean vacation){

        boolean result;

            if (!weekDay || vacation){
                result = true;
            }else {
            result = false;}
            return result;
        }
    }


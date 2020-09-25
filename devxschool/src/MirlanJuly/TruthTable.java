package MirlanJuly;

public class TruthTable {
    public static void main(String[] args){
        int ageOfAnn = 18;
        int ageOfBob = 15;
        char maritalStatus ='u';
        int age = 33;
        int height = 181;
        int weight = 71;
        int y, m, d;
        boolean isEligible = (maritalStatus == 'u') && (age > 21 && age <= 35) && (height > 180) && (weight > 70 && weight < 80);
        boolean experiment1 = (ageOfAnn < ageOfBob) && (ageOfAnn >= ageOfBob) || (ageOfBob != ageOfBob);
        boolean experiment2 = !((ageOfAnn > ageOfBob) && (ageOfAnn <= ageOfBob) || !(ageOfAnn == ageOfBob));
        y = 2011;
        m = 9;
        d = 14;
        boolean isDateInRange = (y <= 2010) && (d >= 1 && d <= 15) && (m <= 10 && m >= 1);
        String experiment3 = (y <= 2010) ? "Yes" : "No"; // No
        int experiment4 = (d > 15) ? 15 : 5;
        System.out.println("Experiment 3, :"+ experiment3);
        System.out.println("Experiment 4 " + experiment4);
        System.out.println(y +" Year, "+ m +" Month, "+ d+" Day, isIn Range = " + isDateInRange);
        System.out.println(experiment1);
        System.out.println(experiment2);
        boolean experiment5 = true || false && false;
        System.out.println("Experiment5 " +experiment5);




    }
}
/**    AND   &&  ( AND have only and always one true, when two comparating sites are true);
 true & true = true;      1 & 1 = 1;    Example1: Int a=5; int b=6;    Example2: int a=11; int b=11;
 false & true = false;    0 & 1 = 0;      true  OR  false            (a<b) && (b==a) || (b<=a)---> result is False;
 true & false = false;    1 & 0 = 0;     (a<b) || ( a>b );             F        T    &&    T
 false & false = false;   0 & 0 = 0;  result is true, because one site is true;       F && T --> False;
 What is Logical operators? it is --> how is relation between Math and Logical math;

       OR  ||  ( if one comparable site is True, --> than result is always True );
 true || true = true;      1 || 1 = 1;
 false || true = true;     0 || 1 = 1;
 true || false = true;     1 || 0 = 1;
 false || false = false;   0 || 0 = 0;  ( if member in range operating --> use AND operating, not use OR operating );
                                                                 Calculated in binary format:
    NOT explanation mark;-->  (!true = false;  !false = true );       0000-->0;     +=1--> 1++;
                                                                      0001-->1;     -=1-->--;
 Example: int a=5;  int b=6;--> !(a<b) && ( b> a ) || ( !a >=b );     0001--> 1;    ++ -> +1 item;
                                !true  &&  true   ||   !false ;       0001 -->1;    -- -> -1 item;
                                false  &&  true  ||   true ;          0010--> 2;    +2 --> 2 times +
                                false  &&   true                      0001          -2 --> 2 times -
                                      False                           0011--> 3;    +10 --> 10 times
 ++b pre--> make change value, than update, give operator acsess value update;
 b++ post ---> take old and update value,acsess value give operation decrementing;
 */


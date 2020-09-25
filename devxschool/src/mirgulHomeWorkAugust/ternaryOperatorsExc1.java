package mirgulHomeWorkAugust;

public class ternaryOperatorsExc1 {
    public static void main(String[] args) {

        int februaryDays = 29;
        String result, result1;
        String result2,result3;
        String uppercase = "JOHN";
        String lowercase = "john";

        result = (februaryDays == 28) ? "not a leap year" : " leap year";
        result1 = (uppercase.equalsIgnoreCase(lowercase))? "true" : "false";
        result2 = (uppercase.equals(lowercase))? "JOHN" : "john";
        result3 = (lowercase.equals(uppercase)) ? "True" : "False";
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

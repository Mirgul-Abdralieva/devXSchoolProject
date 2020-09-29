package nightClass;
// is responsible for having logic(methods) for converting different set of units.
// it has methods which convert units.
public class Converter {

    public static void main(String[] args) {

        Converter myConverter = new Converter();

        double f = myConverter.convertCelsiusToF(11);
        System.out.println("Temp outside in F: " + f);
        double c = myConverter.convertFtoC(51);
        System.out.println("Temp outside in C: " + c);
        double poundOfGold = myConverter.convertKgToLbs(10);
        System.out.println("Pounds of Gold: " + poundOfGold);
        double kmsToWisconsin = myConverter.convertMileToKm(100);
        System.out.println("Distance to Wisconsin in kms: " + kmsToWisconsin);

   //     double f1 = convertCelsiusToF(35);
        myConverter.convertCelsiusToF(35);
    //    System.out.println(f1);
    }


    public  double convertKgToLbs(double kilos){
        double lbs = kilos * 2.20462;
        return lbs;
    }

    public double convertMileToKm(double miles){
        double km = 1.60934 * miles;
        return km;
    }
//   C to F
    public double convertCelsiusToF(double celsius){
        double fahrenheit = (celsius * (double) 9/5) + 35;
        return fahrenheit;
    }
    // F to C
    public  double convertFtoC(double fahrenheit){
        double celsius = (fahrenheit - 32) * (double) 5/9;
        return celsius;
    }

}
